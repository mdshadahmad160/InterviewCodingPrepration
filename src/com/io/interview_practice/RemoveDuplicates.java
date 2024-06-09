package com.io.interview_practice;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        arr = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(arr));

    }
}
