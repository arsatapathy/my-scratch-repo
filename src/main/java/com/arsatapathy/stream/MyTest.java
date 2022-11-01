package com.arsatapathy.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class MyTest {

    public static void main(String... args) {
        List<String> names = new ArrayList<>();

        names.add("ashish");
        names.add("ranjan");
        names.add("satapathy");
        names.add("snigdha");
        names.add("rani");
        names.add("sahoo");


        List<String> newNames = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        newNames.forEach(System.out::println);

        System.out.println("===================");
        List<List<String>> nameArray = new ArrayList<>();

        nameArray.add(List.of("Ashish", "Ranjan", "Satapathy"));
        nameArray.add(List.of("Snigdha", "Rani", "Sahoo"));

        List<String> newNameArray = nameArray.stream().flatMap(x -> x.stream().map(y -> y.toLowerCase())).collect(Collectors.toList());

        newNameArray.forEach(System.out::println);
        
    }
}
