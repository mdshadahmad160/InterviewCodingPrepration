package com.io.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Shad Ahmad
 */
public class DuplicateNumber {
    public static void main(String[] args) {
        int arr[] = {1, 5, 4, 2, 1, 4, 7};
        Set<Integer> uniqueNumber = new HashSet<>();

        boolean isDuplicateExists = false;

        for (int i = 0; i < arr.length; i++) {
            if (uniqueNumber.contains(arr[i])) {
                isDuplicateExists = true;
                System.out.println("Duplicate Numbers are : " + arr[i]);
            } else {
                uniqueNumber.add(arr[i]);
            }
        }
        if (!isDuplicateExists) {
            System.out.println(-1);
        }
    }
}
