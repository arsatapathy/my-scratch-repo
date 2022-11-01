package com.arsatapathy.generics;

public class MyWild {

    public static void pint(MyGen<? extends Number> obj) {
        System.out.println(obj.getObj().doubleValue());
    }
}
