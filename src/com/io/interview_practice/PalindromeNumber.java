package com.io.interview_practice;

/**
 * @author Shad Ahmad
 * @apiNote Palindrome Number means the numbers is exactly match with reverse
 * like 121 in reverse we have 121 like  this is nothing but Palindrome Number
 */


public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 121;
        int originalNumber = number; // Store the original number
        int rev = 0;
        while (number != 0) {
            int last = number % 10;
            rev = rev * 10 + last;
            number = number / 10;
        }

        if (rev == originalNumber) // Compare with the original number, not with 0
            System.out.println(rev + "  This is Palindrome Number : ");
        else
            System.out.println(rev + "  This is Not a  Palindrome Number : ");

    }
}

