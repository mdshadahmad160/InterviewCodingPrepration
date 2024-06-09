package com.io.java8Interview;

import java.util.stream.IntStream;

/**
 * @author Shad Ahmad
 */
public class CheckIsTheStringPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        String temp = str.replaceAll("\\s+", "").toLowerCase();
        System.out.println("is Palindrome String " + IntStream.range(0, temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1)));
    }
}
