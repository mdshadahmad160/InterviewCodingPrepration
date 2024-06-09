package com.io.interview_practice;

/**
 * @author Shad Ahmad
 */

public class SumOfOddDigitCount {

    public static void main(String[] args) {
        int number = 238765;
        int sum = 0;
        int temp = number;
        int count = 0;
        while (number != 0) {
            int last = number % 10;
            if (last % 2 != 0) {
                sum = sum + last;
                count++;
            }
            number = number / 10;
        }
        System.out.println(temp + " Sum Of Odd Digit : " + sum);

    }
}
