package com.io.interview_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateStringStreamAPI {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", " ", "World", "!");
        String concatenate = list.stream().collect(Collectors.joining());
        System.out.println(concatenate);
    }
}
