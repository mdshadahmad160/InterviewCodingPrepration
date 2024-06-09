package com.io.Java8Problems;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachCharacterString {
    public static void main(String[] args) {
        String words = "DevBytesSchool";
        Map<Character, Long> charCount = words.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()));
        System.out.println(charCount);
    }
}
