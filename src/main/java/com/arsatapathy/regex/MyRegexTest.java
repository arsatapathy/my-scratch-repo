package com.arsatapathy.regex;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.text.RandomStringGenerator;

import static org.apache.commons.text.CharacterPredicates.*;

public class MyRegexTest {
    public static void main(String[] args) {
        String regex = "^[a-z0-9_]*$";


        if ("ashish".matches(regex)) System.out.println("ashish matches");
        if ("ashish123".matches(regex)) System.out.println("ashish123 matches");

        if ("ashish satapathy".matches(regex)) System.out.println("ashish satapathy match");

        if ("ASHISH".matches(regex)) System.out.println("ASHISH match");

        if ("ashish_satapathy".matches(regex)) System.out.println("ashish_satapathy match");
        if ("ASHISH_SATAPATHY".matches(regex)) System.out.println("ASHISH_SATAPATHY match");


        if ("".matches(regex)) System.out.println("empty match");

        String s = new RandomStringGenerator.Builder()
                .withinRange('0', 'z')
                .filteredBy(ASCII_LOWERCASE_LETTERS, DIGITS)
                                .build().generate(8);

        System.out.println(s);

        System.out.println("ASHISH123".toLowerCase());
    }
}
