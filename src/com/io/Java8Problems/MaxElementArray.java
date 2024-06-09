package com.io.Java8Problems;

import java.util.Arrays;

public class MaxElementArray {
    public static void main(String[] args) {
        /**
         * Write a java 8 program to find maximum elements in an array
         */
        int[] numbers = {10, 9, 89, 1, 3, 4, 2};

        Arrays.stream(numbers).max().ifPresent(System.out::println);
    }
}
