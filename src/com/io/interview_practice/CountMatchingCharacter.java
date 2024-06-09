package com.io.interview_practice;

public class CountMatchingCharacter {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "abad";

        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j))
                    count++;
                break;
            }
        }
        System.out.println("Matching Characters are " + count);
    }
}
