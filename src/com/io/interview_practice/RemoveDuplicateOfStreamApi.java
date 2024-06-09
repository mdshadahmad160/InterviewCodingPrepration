package com.io.interview_practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateOfStreamApi {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        list.add("B");
        list.stream().distinct().forEach(s -> {
            System.out.println(s);
        });
    }

}
