package com.io.interview_practice;

import java.util.ArrayList;
import java.util.List;

public class LimitStreamAPI {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("c");
        list.add("a");
        list.add("b");
        list.add("d");
        list.add("e");

        list.stream().limit(2).forEach(
                (x) -> {
                    System.out.println(x);
                }
        );
    }
}