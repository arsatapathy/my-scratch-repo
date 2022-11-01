package com.arsatapathy.generics;

public class MyGenTest {
    public static void main(String[] args) {
        MyGen<Integer> i = new MyGen<>(1);
        i.showObjType();

        MyGen<String> s = new MyGen<>("ashish");
        s.showObjType();

        MyGen.printDouble(1);

    }
}
