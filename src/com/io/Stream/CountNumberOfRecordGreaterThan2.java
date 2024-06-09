package com.io.Stream;

import java.util.stream.IntStream;

public class CountNumberOfRecordGreaterThan2 {
    public static void main(String[] args) {

        long countNoGreaterThan2 = IntStream.of(1, 2, 3, 4, 5).filter(s -> s > 2).count();
        System.out.println(countNoGreaterThan2);
    }
}
