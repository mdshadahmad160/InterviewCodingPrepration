package com.io.Java8Problems;

import java.util.Arrays;
import java.util.List;

/**
 * @author Shad Ahmad
 */

public class ConvertWordsToUpperCase {
    /**
     * How to use map to convert the words into UpperCase in java 8
     */
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Dev", "Bytes", "School");

        words.stream().map(word -> word.toUpperCase())
                .forEach(System.out::println);

    }
}
