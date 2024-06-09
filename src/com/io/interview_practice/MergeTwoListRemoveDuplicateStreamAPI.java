package com.io.interview_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoListRemoveDuplicateStreamAPI {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4, 5);
        List<Integer> resultList = Stream.concat(list1.stream(), list2.stream()).distinct().
                collect(Collectors.toList());
        System.out.println(resultList);
    }
}
