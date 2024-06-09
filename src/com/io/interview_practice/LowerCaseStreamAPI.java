package com.io.interview_practice;

import java.util.ArrayList;
import java.util.List;


public class LowerCaseStreamAPI {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("c");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(null);
        list.stream().distinct().filter(x -> x != null)
                .map(y -> y.toUpperCase())
                .forEach(
                        (x) -> {
                            System.out.println(x);
                        }
                );

    }
}
