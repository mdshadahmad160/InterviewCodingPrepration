package com.io.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shad Ahmad
 */
public class DuplicateCharacters {
    public static void main(String[] args) {
        String input = "programming";
        printDuplicateCharacters(input);

    }

    private static void printDuplicateCharacters(String input) {

        Map<Character, Integer> charCountMap = new HashMap<>();

        /**
         * Convert the string to a character array
         */
        char[] charArray = input.toCharArray();

        for (char c : charArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        System.out.println("Duplicate characters in the given string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
