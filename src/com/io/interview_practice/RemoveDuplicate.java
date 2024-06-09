package com.io.interview_practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> uniqueList = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        list.add("B");
        for (String s : list) {
            if (!uniqueList.contains(s)) {
                uniqueList.add(s);
            }
        }
        System.out.println(uniqueList);
    }
}
