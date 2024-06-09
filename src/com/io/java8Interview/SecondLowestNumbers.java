package com.io.java8Interview;

import java.util.Arrays;

/**
 * @author Shad Ahmad
 */
public class SecondLowestNumbers {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 11, 2, 8, 21, 1};

        Integer secondLowestNumbers = Arrays.stream(numbers).boxed().sorted().skip(1).findFirst()
                .get();
        System.out.println(secondLowestNumbers);

    }
}
