package com.io.Java8Problems;

import java.util.Arrays;
import java.util.List;

public class FindFirstOccurrenceElementsArray {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 12, 22, 5, 100, 13);
        /**
         * We need to find 1st Occurrence elements means 10
         * So for that we have a Steam method findFirst
         * with the help of this we can get the 1st Occurrence Arrays
         */

        nums.stream().findFirst()
                .ifPresent(System.out::println);


    }
}
