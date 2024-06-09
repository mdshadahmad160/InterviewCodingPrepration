package com.io.Java8Problems;

import java.util.stream.Stream;

public class ConcatenateTwoString {
    public static void main(String[] args) {
        /**
         * Write a java 8 program to concatenate two stream
         */
        Stream<Integer> s1 = Stream.of(1, 2, 3);
        Stream<Integer> s2 = Stream.of(4, 5, 6);

        Stream.concat(s1, s2).forEach(System.out::println);
    }
}
