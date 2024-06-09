package com.io.interview_practice;

/**
 * @author Shad Ahmad
 */
public class SumOfFirstLastNo {
    public static void main(String[] args) {
        int number = 12345;
        int firstDigit = number;
        while (firstDigit >= 10) {

            firstDigit = firstDigit / 10;

        }

        int lastDigit = number % 10;
        int sum = firstDigit + lastDigit;

        System.out.println("The sum of the first and last digits of " + number + " is: " + sum);

    }
}
