package com.io.java8Interview;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Shad Ahmad
 */
public class DuplicateCharactersInString {
    public static void main(String[] args) {
        String words = "shadahmad";
        System.out.println("Original String: " + words);

        System.out.println(Arrays.stream(words.split(""))
                .filter(str -> words.indexOf(str) != words.lastIndexOf(str))
                .map(str -> str.charAt(0))
                .collect(Collectors.toList()));
    }
}
