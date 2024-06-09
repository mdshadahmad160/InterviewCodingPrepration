package com.io.Java8Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 12, 22, 5, 100, 13, 22, 10);
        Set<Integer> temp = new HashSet<>();
        nums.stream().filter(num -> !temp.add(num)).forEach(System.out::println);

    }
}
