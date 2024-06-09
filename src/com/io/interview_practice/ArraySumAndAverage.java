package com.io.interview_practice;

import java.util.Scanner;

/**
 * @author Shad Ahmad
 */
public class ArraySumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " Elements of Array ");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double average = sum / arr.length;
        System.out.println("sum of " + n + " arrays are = " + sum);
        System.out.println("Average of " + n + " arrays are = " + average);

    }
}
