package com.io.Java8Problems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ArrayOccurrence {
    public static void main(String[] args) {
        /**
         * Given the array {10,1,20,2,100,100,100}
         * write a java code using stream to determine the occurrence of particular value
         */
        int[] values = {10, 1, 20, 2, 100, 100, 100};
        int count = 100;
        long countValues = Arrays.stream(values).filter(value -> value == count).count();
        System.out.println(countValues);

    }
}
