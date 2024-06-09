package com.io.interview_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateInDescendingStreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1);
        List<Integer> collect = numbers.stream().distinct().sorted(Comparator.comparingInt(Integer::intValue)
                .reversed()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
