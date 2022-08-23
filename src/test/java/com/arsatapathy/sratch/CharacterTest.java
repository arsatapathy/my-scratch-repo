package com.arsatapathy.sratch;

public class CharacterTest {
    public static void main(String[] args) {
        isPalindrome("abba");
    }

    static void isPalindrome(String S) {
        // code here
        if (palindrome(S)) {
            System.out.println("palindrom");
        } else {
            System.out.println("not");
        }
    }

    static boolean palindrome(String s) {
        System.out.println("string = " + s);
        if (s.length() <= 1) return true;
        System.out.println("char at 0 = " + s.charAt(0) + " char at end = " + s.charAt(s.length() - 1));
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;

        return palindrome(s.substring(1, s.length() - 1));
    }
}
