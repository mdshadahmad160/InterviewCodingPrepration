package com.io.ArrayCodeSolutions;

/**
 * Given an int array, return true if the array contains 2 twice, or 3 twice.
 * The array will be length 0, 1, or 2.
 * double23([2, 2]) → true
 * double23([3, 3]) → true
 * double23([2, 3]) → false
 */
public class CheckDoubleTrice {
    public boolean checkDoubleTrice(int[] nums){
        if (nums.length==2){
            return (nums[0]==2 && nums[1]==2 || (nums[1]==3 && nums[1]==3));
        }
        return false;
    }
    public static void main(String[] args) {
        CheckDoubleTrice solution = new CheckDoubleTrice();
        System.out.println(solution.checkDoubleTrice(new int[]{2, 2})); // Output: true
        System.out.println(solution.checkDoubleTrice(new int[]{3, 3})); // Output: true
        System.out.println(solution.checkDoubleTrice(new int[]{2, 3})); // Output: false
    }

}
