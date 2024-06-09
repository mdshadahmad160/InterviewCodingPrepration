package com.io.ArrayCodeSolutions;

public class CountOfEachOccurrenceNumbersAndSum {

    static void count(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            int sum = 0;
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    a[j] = a[n - 1];
                    count++;
                    n--;
                    j--;

                }
            }
            System.out.println(a[i] + "====>" + count);

        }
    }

    public static void main(String[] args) {
        int a[] = {2, 1, 1, 2, 3, 3, 4, 5, 5, 4};
        count(a);
    }
}
