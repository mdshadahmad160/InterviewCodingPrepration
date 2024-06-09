package com.io.java8Interview;

import java.util.stream.Stream;

/**
 * @author Shad Ahmad
 * Print the first 10 odd numbers
 * Write a Java 8 program to print the first 10 odd numbers.
 */
public class FirstTenOddNumbers {
    public static void main(String[] args) {
        Stream.iterate(1, i -> i + 2)
                .limit(10)
                .forEach(System.out::println);
    }
}
