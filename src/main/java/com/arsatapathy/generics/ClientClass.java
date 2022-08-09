package com.arsatapathy.generics;

public class ClientClass extends FunctionalInterfaceDemo {

    public int myTest() {
        return doing(this::myTesting);
    }

    public int myTest(String name) {
        System.out.println("My name is " + name);
        return doing(
                () -> this.myTesting()
        );
    }

    private int myTesting() {
        return 5;
    }
}
