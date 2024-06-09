package com.io.java8Interview;

import java.util.Arrays;

/**
 * @author Shad Ahmad
 */
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String tempStr = "shadahmad";
        System.out.println(Arrays.stream(tempStr.split(""))
                .filter(str -> tempStr.indexOf(str) == tempStr.lastIndexOf(str))
                .findFirst()
                .orElse(""));
    }
}
