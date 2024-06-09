package com.io.interview_practice;

import java.util.ArrayList;
import java.util.List;

public class NonMatchStreamAPI {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("we");
        list.add("are");
        list.add("going");
        list.add("to");
        list.add("conduct");
        list.add("workshop");
        list.add("from");
        list.add("shadTech");
        boolean checkMatch = list.stream().noneMatch(
                x -> x.startsWith("from")
        );
        System.out.println(checkMatch);
    }
}
