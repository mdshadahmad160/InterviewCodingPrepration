package com.io.interview_practice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shad Ahmad
 */
public class SortingDataOnKeyAscendingStreamAPI {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "C");
        map.put(3, "A");
        map.put(1, "D");
        map.put(4, "B");
        /**
         * Sorting the data based on value in Ascending Order
         */
        map.entrySet().stream().sorted(
                        Map.Entry.comparingByValue())
                .forEach(
                        (x) -> {
                            System.out.println(x);
                        }
                );
    }
}
