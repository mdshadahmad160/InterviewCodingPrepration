package com.io.java8Interview;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Shad Ahmad
 */
public class SecondHighestNoInAnArray {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 11, 2, 8, 21, 1};
        Integer secondHighestNumbers = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();
        System.out.println(secondHighestNumbers);
    }
}
