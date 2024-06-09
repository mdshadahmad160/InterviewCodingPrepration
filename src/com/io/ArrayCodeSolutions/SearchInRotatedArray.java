package com.io.ArrayCodeSolutions;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 8, 1, 2};
        System.out.println(searchRotatedArray(arr, 7));
    }

    private static int searchRotatedArray(int nums[], int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (nums[0] <= nums[mid]) {
                if (target >= nums[0] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
