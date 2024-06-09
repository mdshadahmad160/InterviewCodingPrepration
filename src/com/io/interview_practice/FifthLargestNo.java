package com.io.interview_practice;

import java.util.Arrays;

public class FifthLargestNo {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7, 2, 8, 4, 6};
        Arrays.sort(arr);
        System.out.println("Fifth Largest Number: " + arr[arr.length - 5]);
    }

}
