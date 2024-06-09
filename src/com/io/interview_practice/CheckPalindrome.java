package com.io.interview_practice;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "Radar", reverseStr = "";
        int strLength = str.length();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a PALINDROME STRING: ");
        } else {
            System.out.println(str + " is not a  PALINDROME STRING: ");
        }
    }
}
