package com.io.Java8Problems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Write java program to perform square of a number and then checks its greater than 50 or not
 */
public class SquareFindGreaterThan50 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 12, 22, 5, 100, 13, 55, 53, 22, 10, 1, 2);

        numbers.stream().map(num -> num * num).filter(num -> num > 50)
                .forEach(System.out::println);
    }
}
