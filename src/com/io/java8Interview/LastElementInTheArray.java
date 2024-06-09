package com.io.java8Interview;

import java.util.Arrays;

/**
 * @author Shad Ahmad
 * Get the last element of an array
 * Write a Java 8 program to get the last element of an array.
 */

public class LastElementInTheArray {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5};

        Integer lastElementInArray = Arrays.stream(array)
                .boxed().reduce((first, second) -> second).orElse(-1);
        System.out.println("Last Element in an Arrays Is: " + lastElementInArray);
    }
}
