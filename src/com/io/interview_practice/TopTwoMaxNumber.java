package com.io.interview_practice;

import java.util.Arrays;

/**
 * Write a java program to find out the maximum numbers from an integer
 */
public class TopTwoMaxNumber {
    public static void main(String[] args) {
        topTwo(new int[]{20, 34, 21, 87, 92, Integer.MAX_VALUE});
        topTwo(new int[]{0, Integer.MIN_VALUE, -2});
        topTwo(new int[]{Integer.MAX_VALUE, 0, Integer.MAX_VALUE});
        topTwo(new int[]{1, 1, 0});


    }

    public static void topTwo(int[] numbers) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max1) {
                max2 = max1;
                max1 = number;
            } else if (number > max2) {
                max2 = number;

            }
        }
        System.out.println("Given integer Array: " + Arrays.toString(numbers));
        System.out.println("First maximum number: " + max1);
        System.out.println("Second maximum number: " + max2);
    }
}
