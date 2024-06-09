package com.io.interview_practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMapToListStreamAPI {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "C");
        map.put(3, "A");
        map.put(1, "D");
        map.put(4, "B");
        List<Integer> integerList = map.keySet()
                .stream().collect(Collectors.toList());
        System.out.println(integerList);

    }
}
