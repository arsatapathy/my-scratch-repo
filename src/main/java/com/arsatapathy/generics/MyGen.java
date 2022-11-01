package com.arsatapathy.generics;

public class MyGen<T> {

    private final T obj;

    public MyGen(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void showObjType() {
        System.out.println(obj.getClass().getSimpleName());
    }

    public static <V extends Number> void printDouble(V v) {
        System.out.println(v.doubleValue());
    }
}
