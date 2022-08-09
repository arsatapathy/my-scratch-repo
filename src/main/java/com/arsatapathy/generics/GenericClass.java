package com.arsatapathy.generics;

public class GenericClass<T> {

    private T t;

    public GenericClass(T t) {
        this.t = t;
    }

    public void print() {
        System.out.println("t = " + t);
    }

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
