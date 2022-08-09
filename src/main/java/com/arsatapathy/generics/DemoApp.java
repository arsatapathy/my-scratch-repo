package com.arsatapathy.generics;

import java.util.Optional;

public class DemoApp {

    public static void main(String[] args) {
        ClientClass client = new ClientClass();

        int n = client.myTest();
        System.out.println("n = " + n);

        n = client.myTest("ashish");
        System.out.println("n = " + n);

        FunctionalInterfaceDemo demo = new FunctionalInterfaceDemo();

        n = demo.doing(() -> 5);

        System.out.println("n = " + n);

        n = demo.doing(() -> {
            int x = 9;
            return x;
        });

        System.out.println("n = " + n);

        Optional<Integer> opt = demo.doing(() -> Optional.of(5));
        System.out.println(opt.map(x -> " n = " + x).orElse("not present"));

        GenericDemoClient gClient = new GenericDemoClient();
        gClient.doThis(6);
        gClient.doThis(7L);
    }
}
