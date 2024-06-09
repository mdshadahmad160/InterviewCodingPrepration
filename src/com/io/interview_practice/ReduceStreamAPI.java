package com.io.interview_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Shad Ahmad
 * @apiNote Reduce(): It will reduce the data into single unit
 */

public class ReduceStreamAPI {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        /**
         * Here We will use Optional class to avoid null pointer exception
         */
        Optional<Integer> reduce = list.stream().reduce(
                (a, b) -> a + b);
        System.out.println(reduce.get());
    }
}
