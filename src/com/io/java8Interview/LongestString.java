package com.io.java8Interview;

import java.util.Arrays;

/**
 * @author Shad Ahmad
 */
public class LongestString {
    public static void main(String[] args) {
        String[] strArray = {"java", "techie", "springboot", "microservices"};
        String longestString = Arrays.stream(strArray).reduce((word1, word2) ->
                word1.length() > word2.length() ? word1 : word2).get();
        System.out.println(longestString);
    }
}
