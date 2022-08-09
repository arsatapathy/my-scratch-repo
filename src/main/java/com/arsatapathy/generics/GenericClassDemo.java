package com.arsatapathy.generics;

public class GenericClassDemo {
    public static void main(String[] args) {
        int n = 5;

        GenericClass<Integer> genericClass = new GenericClass<>(n);

        genericClass.print();

        n = 6;

        genericClass.setT(n);

        genericClass.print();
    }
}
