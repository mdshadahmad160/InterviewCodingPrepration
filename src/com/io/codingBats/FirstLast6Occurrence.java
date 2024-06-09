package com.io.codingBats;

/**
 * @author Shad Ahmad
 * Questions:
 * Given an array of ints, return true if 6 appears as either the first or
 * last element in the array. The array will be length 1 or more.
 * firstLast6([1, 2, 6]) → true
 * firstLast6([6, 1, 2, 3]) → true
 * firstLast6([13, 6, 1, 2, 3]) → false
 */

public class FirstLast6Occurrence {

    public static boolean firstLastOccurrence(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(firstLastOccurrence(new int[]{1, 2, 6}));
        System.out.println(firstLastOccurrence(new int[]{6, 1, 2, 3}));
        System.out.println(firstLastOccurrence(new int[]{13, 6, 1, 2, 3}));
        System.out.println(firstLastOccurrence(new int[]{6}));
        System.out.println(firstLastOccurrence(new int[]{1, 2, 3, 4, 6}));
        System.out.println(firstLastOccurrence(new int[]{1, 2, 3, 4, 5}));
    }


}
