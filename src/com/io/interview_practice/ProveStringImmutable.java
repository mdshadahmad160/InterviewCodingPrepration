package com.io.interview_practice;

public class ProveStringImmutable {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        System.out.println("Before Modification in str1");
        referenceCheck(str1, str2);
        str1 += "ava";
        System.out.println("After Modification: ");
        referenceCheck(str1, str2);
    }

    private static void referenceCheck(Object x, Object y) {
        if (x == y) {
            System.out.println("Both Pointing to the same reference: ");
        } else {
            System.out.println("Both Pointing to the different  reference: ");
        }
    }
}
