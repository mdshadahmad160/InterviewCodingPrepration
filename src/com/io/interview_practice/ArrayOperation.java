package com.io.interview_practice;

import java.util.Scanner;

/**
 * @author Shad Ahmad
 */
public class ArrayOperation {
    /**
     * Sum of n elements of Array
     */
    double sumOfArray(int a[]) {
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    /**
     * Read the Array Elements
     */
    int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("enter " + n + " Elements of Array");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;

    }

    /**
     * Display entered Array elements
     */
    void dispArr(int ele[]) {
        for (int i = 0; i < ele.length; i++) {
            System.out.println(ele[i]);
            if (i < ele.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    /**
     * Get the Biggest Array elements
     */
    public int getBiggest(int[] arr) {
        int big = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > big) {
                big = arr[i];
            }
        }
        return big;
    }

    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int ar[] = ao.readArray();
        System.out.print("Entered elements are ");
        ao.dispArr(ar);
        int k = ao.getBiggest(ar);
        System.out.println("Biggest element is = " + k);
        double sum = ao.sumOfArray(ar);
        double avg = sum / ar.length;
        System.out.println("sum of " + ar.length + " arrays are = " + sum);
        System.out.println("Average of " + ar.length + " arrays are = " + avg);
    }
}
