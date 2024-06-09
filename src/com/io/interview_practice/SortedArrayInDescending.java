package com.io.interview_practice;

import java.util.Arrays;
import java.util.Comparator;

public class SortedArrayInDescending {
    public static void main(String[] args) {
        Integer a[] = {10, 30, 20, 10, 20, 30};
        Arrays.stream(a)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
