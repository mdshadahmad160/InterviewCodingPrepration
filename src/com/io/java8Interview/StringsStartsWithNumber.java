package com.io.java8Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Shad Ahmad
 */
public class StringsStartsWithNumber {
    public static void main(String[] args) {
        String[] words = {"shad", "foo", "nemo", "target1", "12Target", "2robot"};
        System.out.println("Original String: " + Arrays.toString(words));

        List<String> stringStartWithNumber = Arrays.stream(words)
                .filter(word -> Character.isDigit(word.charAt(0)))
                .collect(Collectors.toList());

        System.out.println("strings started with a number " + stringStartWithNumber);

    }
}
