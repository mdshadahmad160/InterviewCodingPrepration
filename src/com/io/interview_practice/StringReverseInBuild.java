package com.io.interview_practice;

public class StringReverseInBuild {
    public static void main(String[] args) {
        String str = "Main String to be reversed";
        StringBuilder stringBuilder = new StringBuilder(str);
        str = stringBuilder.reverse().toString();
        System.out.println("Reverse String: " + str);
    }
}
