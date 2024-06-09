package com.io.interview_practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortingDataOnKeyStreamAPI {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "C");
        map.put(3, "A");
        map.put(1, "D");
        map.put(4, "B");
        /**
         * Requirements: Sort the Data based on key in Descending Order
         */
        map.entrySet().stream().sorted(
                        Map.Entry.comparingByKey(Collections.reverseOrder()))
                .forEach(
                        (x) -> {
                            System.out.println(x);
                        }
                );
    }
}
