package com.io.ArrayCodeSolutions;

import java.util.Scanner;

public class CountOfEachOccurrenceNumbers {
    static void count(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    a[j] = a[n - 1];
                    count++;
                    n--;
                    j--;
                }
            }
            System.out.println(a[i] + " =========> " + count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first 1 Array size");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the " + n + " element in First Element");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        count(a);
    }
}
