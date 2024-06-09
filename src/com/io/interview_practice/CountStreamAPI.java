package com.io.interview_practice;

import java.util.ArrayList;
import java.util.List;

public class CountStreamAPI {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Long count = list.stream().count();
        System.out.println(count);
    }
}
