package com.io.solutions;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";


        boolean isAnagram = isAnagram(str1, str2);

        if (isAnagram) {
            System.out.println(str1 + "    and   " + str2 + " are anagrams: ");
        } else {
            System.out.println(str1 + "   and   " + str2 + "  are not  anagrams: ");
        }
    }

    private static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        return Arrays.equals(charArray1, charArray2);
    }
}
