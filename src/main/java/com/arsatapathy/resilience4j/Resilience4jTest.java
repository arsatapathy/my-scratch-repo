package com.arsatapathy.resilience4j;

import io.github.resilience4j.timelimiter.TimeLimiter;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;

import java.time.Duration;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Resilience4jTest {

    public static void main(String[] args) {
        TimeLimiterConfig config = TimeLimiterConfig.custom().timeoutDuration(Duration.ofSeconds(5)).build();
        TimeLimiter timeLimiter = TimeLimiter.of("My Limiter", config);

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Callable<String> callable = TimeLimiter.decorateFutureSupplier(timeLimiter, () -> executorService.submit(() -> {
            System.out.println("executing...");
            Thread.sleep(4000);
            return "ashish";
        }));

        try {
            System.out.println(callable.call());
        } catch (Exception e) {
            e.printStackTrace();
        }

        executorService.shutdown();
    }
}
