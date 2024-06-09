package com.io.interview_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestStringStreamAPI {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange", "kiwi", "strawberry");
        Optional<String> max = list.stream().max(Comparator.comparingInt(String::length));
        System.out.println(max.get());

    }
}