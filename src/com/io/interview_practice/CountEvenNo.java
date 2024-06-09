package com.io.interview_practice;

/**
 * @author Shad Ahmad
 */

public class CountEvenNo {
    public static void main(String[] args) {
        /**
         * Initially Count will be 0
         */
        int count = 0;
        /**
         * This is number where we have to find out how many numbers are even in this
         */
        int number = 763928;
        /**
         * All the given numbers we can store inside Temp variable
         */
        int temp = number;
        /**
         * Now  I wanted to check at that time when given numbers is not equal to zero
         */

        while (number != 0) {
            /**
             * 763928 this is the number with the help of this number % 10, we can get the last
             * number from given no So we gave first 8 No  and store into the last variable
             */
            int last = number % 10;
            /**
             * Here we are trying to check the last variable means 8 is divisible by 2 or not
             * if yes then it will count +1
             */
            /**
             * 76392  we will gate 2 and store it to the last variable
             * Now check 2 is divisible by 2 is equal to zero yes then it count +1
             */
            if (last % 2 == 0) {
                count++;
            }
            /**
             * With the help of  we will get this number and remove last Number means 8 will be remove from the given number
             *  So we will gate this Number only 76392  and pass the condition as it is
             */
            number = number / 10;
        }
        System.out.println(temp + " has " + count + " Even Digit");
    }
}
