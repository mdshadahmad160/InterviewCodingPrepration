package com.io.interview_practice;

import java.util.Arrays;

public class ArrayRemoveDuplicate {
    public static void main(String[] args) {
        int a[] = {10, 30, 20, 10, 20, 30};

        Arrays.stream(a).sorted().distinct().forEach(
                (x) -> {
                    System.out.println(x);
                }
        );
    }
}
