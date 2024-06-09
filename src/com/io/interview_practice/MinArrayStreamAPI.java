package com.io.interview_practice;

import java.util.Arrays;

public class MinArrayStreamAPI {
    public static void main(String[] args) {
        int a[] = {10, 11, 12, 13};

        int min = Arrays.stream(a).min().getAsInt();
        System.out.println(min);
    }
}
