package com.io.interview_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindFirstStreamAPI {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Optional<Integer> findFirst = list.stream().findFirst();
        System.out.println(findFirst.get());
    }
}
