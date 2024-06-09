package com.io.interview_practice;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {
        Integer[] arr = {8, 6, 0, 4, 6, 4, 2, 7};
        Arrays.sort(arr, Comparator.reverseOrder());
        StringBuilder builder = new StringBuilder();
        for (Integer num : arr) {
            builder.append(num);
        }
        System.out.println("Largest Numbers: " + builder.toString());
    }


}
