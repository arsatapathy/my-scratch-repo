package com.arsatapathy.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class Demo {
    Demo() {

    }

    public static void main(String[] args) {
//        String[] array = new String[]{"ashish", "ranjan", "satapathy", "ashish"};
//        List<String> list = new ArrayList<>(Arrays.asList(array));
//        list.forEach(value -> {
//                    if (value.equals("ashish")) {
//                        list.remove("ashish");
//                    }
//                }
//        );
//        Iterator<String> item = list.iterator();
//        while (item.hasNext()) {
//            System.out.println(item.next());
//        }
//
//        Function<String, String> capitalize = String::toUpperCase;
//
//        System.out.println("ashish".getClass().getSimpleName());
//
//        try {
//            System.out.println("ashish");
//        }catch (ArithmeticException e) {
//            e.printStackTrace();
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        for (int i=0; i<10; i=i++){
//            i+=1;
//            System.out.println("hello");
//        }


        double pick = 2;
        int jar = (int) pick;

        Function<Integer, String> odd = x -> {
            return x%2 ==0 ? "evn":"odd";
        };

        List<Integer> numbers = List.of(1,2,3,4,5);





    }
}
