package com.io.interview_practice;

import java.util.Arrays;

public class ArrayLength {
    public static void main(String[] args) {
        int a[] = {10, 20, 30};


        Long count = Arrays.stream(a).count();
        System.out.println(count);
    }
}
