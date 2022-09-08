package com.arsatapathy.resilience4j;

import io.github.resilience4j.timelimiter.TimeLimiter;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class Resilience4jTest {

    public static void main(String[] args) {
        TimeLimiterConfig config = TimeLimiterConfig.custom().timeoutDuration(Duration.ofSeconds(2)).build();
        TimeLimiter timeLimiter = TimeLimiter.of("My Limiter", config);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }

        List<Callable<String>> callables = integers.stream().map(
                i -> TimeLimiter.decorateFutureSupplier(timeLimiter, () ->
                        CompletableFuture.supplyAsync(
                                () -> {
                                    System.out.println("executing " + i + " at " + df.format(LocalDateTime.now()));
                                    if (i == 5) {
                                        try {
                                            Thread.sleep(1000000000000000000L);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    } else {
                                        try {
                                            Thread.sleep(1000L);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                    System.out.println("finished execution of " + i + " at " + df.format(LocalDateTime.now()));
                                    return "ashish " + i;
                                }
                        )
                )
        ).collect(Collectors.toList());

        ExecutorService ex = Executors.newFixedThreadPool(5);

        callables.forEach(
                c ->
                        ex.execute(() -> {
                                    try {
                                        System.out.println("got " + c.call() + " at " + df.format(LocalDateTime.now()));
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                        )
        );

        ex.shutdown();
    }
}
