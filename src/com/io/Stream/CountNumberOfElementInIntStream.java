package com.io.Stream;

import java.util.stream.IntStream;

public class CountNumberOfElementInIntStream {
    public static void main(String[] args) {

        long count = IntStream.of(1, 2, 3, 4, 5).count();
        System.out.println("Count:- " + count);
    }
}
