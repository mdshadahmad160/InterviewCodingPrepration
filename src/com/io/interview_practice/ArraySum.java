package com.io.interview_practice;

import java.util.Arrays;

/**
 * @author Shad Ahmad
 */

public class ArraySum {
    public static void main(String[] args) {
        int a[] = {10, 20, 30};
        int sum = Arrays.stream(a).sum();
        System.out.println(sum);
    }
}
