package com.io.interview_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MaxElementStreamAPI {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Optional<Integer> max = list.stream().max(
                (v1, v2) -> v1.compareTo(v2)
        );
        System.out.println(max.get());
    }
}
