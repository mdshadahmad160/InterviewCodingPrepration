package com.io.interview_practice;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Shad";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}
