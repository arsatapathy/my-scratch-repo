package com.arsatapathy.math;

import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        System.out.println(Math.max(0, 3));
        System.out.println(Math.max(0, 0));

        Set<Character> healper = Set.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
        Map<Character, Integer> map = Map.of('1', 1, '2', 2);
    }
}
