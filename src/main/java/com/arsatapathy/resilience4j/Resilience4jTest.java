package com.arsatapathy.resilience4j;

import io.github.resilience4j.timelimiter.TimeLimiter;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class Resilience4jTest {

    public static void main(String[] args) {
        TimeLimiterConfig config = TimeLimiterConfig.custom().timeoutDuration(Duration.ofSeconds(1)).build();
        TimeLimiter timeLimiter = TimeLimiter.of("My Limiter", config);

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }

        List<Callable<String>> callables = integers.stream().map(
                i -> TimeLimiter.decorateFutureSupplier(timeLimiter, () ->
                        executorService.submit(
                                () -> {
                                    System.out.println("executing..." + i);
                                    if (i == 5) {
                                        Thread.sleep(1000000000000000000L);
                                    }
                                    System.out.println("finished execution..." + i);
                                    return "ashish" + i;
                                }
                        )
                )
        ).collect(Collectors.toList());

        callables.forEach(c -> {
            try {
                System.out.println("got : " + c.call());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        executorService.shutdown();
    }
}
