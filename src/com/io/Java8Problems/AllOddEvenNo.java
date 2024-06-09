package com.io.Java8Problems;

import java.util.Arrays;
import java.util.List;

public class AllOddEvenNo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 12, 22, 5, 100, 13);
        /**
         * Given a list of integer ,find out all the odd and even no that exists
         * in the list using Stream API
         */
        nums.stream().filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        System.out.println("__________________________________");

        nums.stream().filter(i -> i % 2 != 0)
                .forEach(System.out::println);
    }
}
