package com.io.interview_practice;

import java.util.Arrays;

public class EvenNoStreamAPI {
    public static void main(String[] args) {
        int a[] = {10, 12, 13, 15, 17};

        Arrays.stream(a).filter(x -> x % 2 == 0)
                .forEach(
                        (x) -> {
                            System.out.println(x);
                        }
                );
    }
}
