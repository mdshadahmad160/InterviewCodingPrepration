package com.io.interview_practice;

import java.util.HashMap;
import java.util.Map;

public class FetchingOnlyKeyStreamAPI {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "S");
        map.put(6, "A");
        map.put(7, "B");
        map.put(8, "C");
        map.keySet().stream().forEach(
                (k) -> {
                    System.out.println(k);
                }
        );
    }
}
