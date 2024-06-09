package com.io.interview_practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shad Ahmad
 * @apiNote anyMatch() will take predicate as an input and then return true if any elements
 * satisfy the given condition else return false
 */
public class AnyMatchStreamAPI {
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
        boolean checkMatch = list.stream().anyMatch(
                x -> x.startsWith("from")
        );
        System.out.println(checkMatch);
    }
}
