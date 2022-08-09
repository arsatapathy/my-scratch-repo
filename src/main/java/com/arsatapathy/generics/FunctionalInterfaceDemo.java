package com.arsatapathy.generics;

public class FunctionalInterfaceDemo {
    protected  <T> T doing(Test<T> test) {
        return test.testing();
    }


    @FunctionalInterface
    protected interface Test<T> {
        T testing();
    }
}
