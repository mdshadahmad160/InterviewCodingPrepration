package com.io.solutions;

/**
 * @author Shad Ahmad
 */
public class CharacterOccurrence {
    public static void main(String[] args) {
        String input = "programming";
        char targetChar = 'g';

        int count = countOccurrences(input, targetChar);
        System.out.println("The character '" + targetChar + "' occurs " + count + " times in the string.");

    }

    public static int countOccurrences(String str, char ch) {
        if (str.isEmpty()) {
            return 0;
        }
        int count = (str.charAt(0) == ch) ? 1 : 0;
        return count + countOccurrences(str.substring(1), ch);
    }
}
