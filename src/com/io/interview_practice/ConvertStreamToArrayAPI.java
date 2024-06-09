package com.io.interview_practice;

import java.util.ArrayList;
import java.util.List;

public class ConvertStreamToArrayAPI {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Object[] objects = list.stream().toArray();
        for (Object o : objects) {
            System.out.println(o);
        }
    }
}
