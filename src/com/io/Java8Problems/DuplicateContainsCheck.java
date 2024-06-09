package com.io.Java8Problems;

import java.util.Arrays;
import java.util.List;

/**
 * Given a list of integer we need to check the array is contains Duplicate or not
 */
public class DuplicateContainsCheck {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 3, 1};
        if (Arrays.stream(nums).distinct().count() != nums.length) {
            System.out.println("It Contains Duplicates Values : ");
        } else {
            System.out.println("Its contains Unique value");
        }

    }
}
