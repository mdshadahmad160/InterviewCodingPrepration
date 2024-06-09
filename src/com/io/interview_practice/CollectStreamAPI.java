package com.io.interview_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Shad Ahmad
 */

public class CollectStreamAPI {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        List<Integer> collect=list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
}
