package com.io.interview_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("how");
        list.add("are");
        list.add("you");
        System.out.println("Before Reverse List: " + list);
        Collections.reverse(list);//Reversing List using inbuilt function of collection
        System.out.println("After Reversing List: " + list);
        List<String> reverseList = new ArrayList<>();//Reverse List using without inbuilt method
        for (int i = (list.size() - 1); i >= 0; i--) {
            reverseList.add(list.get(i));
        }
        System.out.println("Reverse without inbuilt method = " + reverseList);
    }
}
