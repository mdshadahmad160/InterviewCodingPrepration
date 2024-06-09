package com.io.ArrayCodeSolutions;

import java.util.Scanner;

public class MergeArray {

    static int[] merge(int[] a, int[] b) {
        int c[] = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }

        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First 1 Array Size: ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the " + n + " Elements in First Elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Enter The Second Array Size : ");
        int m = scanner.nextInt();
        int b[] = new int[m];
        System.out.println("Enter the " + m + " element in Second Element");
        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextInt();
        }
        int c[] = merge(a, b);
        System.out.println("After Merge Array : ");
        System.out.println("[");
        for (int i = 0; i < c.length; i++) {
            if (i < c.length - 1) {
                System.out.println(c[i] + ",");
            } else {
                System.out.println(c[i]);
            }
        }
        System.out.println("]");


    }
}
