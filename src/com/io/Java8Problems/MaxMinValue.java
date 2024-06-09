package com.io.Java8Problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author Shad Ahmad
 * Write A Java program to find Max no and Min No from the List of Integer
 */
public class MaxMinValue {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 12, 22, 5, 100, 13);

        Optional<Integer> max = nums.stream().max(Integer::compareTo);
        System.out.println(max.orElse(null));
        Optional<Integer> min = nums.stream().min(Integer::compareTo);
        System.out.println(min.orElse(null));


    }
}
