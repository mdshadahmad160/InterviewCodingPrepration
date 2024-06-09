package com.io.interview_practice;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int a[] = {10, 50, 20, 100, 120};
        Arrays.stream(a).sorted().forEach(
                (x) -> {
                    System.out.println(x);
                }
        );
    }
}
