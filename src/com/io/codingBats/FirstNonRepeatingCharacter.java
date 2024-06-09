package com.io.codingBats;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shad Ahmad
 * Question: Write a function that takes in a String of lower case English alphabet letters
 * and returns the index of the String first non-Repeating character
 * The first non-Repeating character is the first character in the String that occurs
 * only ones
 * if the String does not have non-Repeating character then the function returns -1
 * <p>
 * Ex:
 * input: abcdcaf
 * output: 1
 */
public class FirstNonRepeatingCharacter {

    public static int firstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String input = "abcdcaf";
        int result = firstNonRepeatingChar(input);
        System.out.println(result);
    }
}
