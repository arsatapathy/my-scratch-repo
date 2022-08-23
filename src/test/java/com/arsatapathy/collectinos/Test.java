package com.arsatapathy.collectinos;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("ashish");
        list.add("ranjan");
        list.add("satapathy");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        list.remove(0);

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        Queue<String> queue = new LinkedList<>();

        queue.add("ashish");
        queue.add("ranjan");
        queue.add("satapathy");

        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
