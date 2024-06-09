package com.io.interview_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMapStreamAPI {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Map<Integer, Integer> map = list.stream()
                .collect(Collectors.toMap(
                        key -> key,
                        value -> value * value
                ));

        System.out.println(map);
    }
}
