package com.io.java8Interview;

import java.util.Arrays;

/**
 * @author Shad Ahmad
 */
public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String words = "shadahmad";
        System.out.println(Arrays.stream(words.split(""))
                .filter(str -> words.indexOf(str) != words.lastIndexOf(str))
                .findFirst().orElse(""));
    }
}
