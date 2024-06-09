package com.io.Java8Problems;

import java.util.Arrays;
import java.util.List;

/**
 * Requirements: We need to find out the Total No of elements in a list using stream API
 */
public class FindTotalNo {
    public static void main(String[] args) {
        /**
         * We need to find count means how many elements are present
         */
        List<Integer> nums = Arrays.asList(10, 12, 22, 5, 100, 13);

        Long count = nums.stream().count();
        System.out.println("Total no of elements are : " + count);
    }
}
