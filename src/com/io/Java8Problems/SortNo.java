package com.io.Java8Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortNo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 12, 22, 5, 100, 13);

        List<Integer> sortedArray = nums.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted Array: " + sortedArray);

    }
}
