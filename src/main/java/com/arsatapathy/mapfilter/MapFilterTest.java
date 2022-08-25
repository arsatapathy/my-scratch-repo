package com.arsatapathy.mapfilter;

import java.util.List;
import java.util.stream.Collectors;

public class MapFilterTest {
    public static void main(String[] args) {
        List<String> newNames = List.of("ashish", "ranjan", "satapathy");
        List<String> presentNames = List.of("ranjan");

        List<String> finalNames = newNames.stream()
                .filter(name -> !presentNames.contains(name))
                .collect(Collectors.toList());

        System.out.println(finalNames.size());
    }
}
