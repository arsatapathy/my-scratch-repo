package com.arsatapathy.generics;

public class GenericDemoClient {
    public void doThis(int n) {
        GenericDemo genericDemo = () -> {
            System.out.println("n = " + n);
            return n;
        };

        genericDemo.demo();
    }

    public void doThis(long n) {
        GenericDemo<Object> genericDemo = () -> {
            System.out.println("n = " + n);
            return n;
        };

        genericDemo.demo();
    }
}
