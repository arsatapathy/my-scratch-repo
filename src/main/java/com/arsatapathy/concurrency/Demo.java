package com.arsatapathy.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        executorService.execute(() -> {
                    System.out.println("task0 " + Thread.currentThread().getName());

                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );

        executorService.execute(() -> {
                    System.out.println(Thread.currentThread().getName());
                    Thread thread1 = new Thread(() -> System.out.println("task1 " + Thread.currentThread().getName()));
                    Thread thread2 = new Thread(() -> System.out.println("task2 " + Thread.currentThread().getName()));
                    Thread thread3 = new Thread(() -> {
                        System.out.println("task3 " + Thread.currentThread().getName());
                        Thread threadX = new Thread(() -> {
                            System.out.println("sub task1 " + Thread.currentThread().getName());
                        });

                        Thread threadY = new Thread(() -> {
                            System.out.println("sub task2 " + Thread.currentThread().getName());
                        });

                        Thread threadZ = new Thread(() -> {
                            System.out.println("sub task3 " + Thread.currentThread().getName());
                        });

                        threadX.start();
                        threadY.start();
                        threadZ.start();
                    });

                    thread1.start();
                    thread2.start();
                    thread3.start();
                }
        );


        executorService.shutdown();
    }
}
