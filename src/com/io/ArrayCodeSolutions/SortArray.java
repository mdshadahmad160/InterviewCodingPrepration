package com.io.ArrayCodeSolutions;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = sc.nextInt();
        int[] ar = new int[size];
        System.out.println("enter " + size + " values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter the size where arrange");
        int k = sc.nextInt();
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (i <= k) {
                    if (ar[i] < ar[j]) {
                        int temp = ar[j];
                        ar[j] = temp;
                    }
                } else {
                    if (ar[j] > ar[i]) {
                        int temp = ar[i];
                        ar[i] = ar[j];
                        ar[j] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(ar));

    }
}
