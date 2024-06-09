package com.io.Java8Problems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class SortArrayConvertToStream {
    /**
     * Write a java 8 program to sort the Array and then converted
     * the sorted array into Stream
     */
    public static void main(String[] args) {

        int[] numbers = {10, 9, 89, 1, 3, 4, 2};
        //Here we need to sort the array
        Arrays.sort(numbers);
        //Here we need to convert that sorted array into stream
        Arrays.stream(numbers).forEach(System.out::println);
    }
}
