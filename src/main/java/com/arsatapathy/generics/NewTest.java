package com.arsatapathy.generics;

public class NewTest {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();

        //compiler errror
        //ReferenceType
        //- Syntax error, insert "Dimensions" to complete
//        ReferenceType
//        Box stringBox = new Box();

        integerBox.add(10);
        printBox(integerBox);
    }

    private static void printBox(Box box) {
        System.out.println("Value: " + box.get());
    }

    static class Box<T> {
        private T t;

        public void add(T t) {
            this.t = t;
        }

        public T get() {
            return t;
        }
    }
}

