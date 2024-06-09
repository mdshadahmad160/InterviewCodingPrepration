package com.io.Java8Problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedArrayDescending {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 12, 22, 5, 100, 13, 22, 10);

        nums.stream().sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

}
