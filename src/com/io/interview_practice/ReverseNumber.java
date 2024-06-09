package com.io.interview_practice;

/**
 * @author Shad Ahmad
 */

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 123456;
        int reverse = 0;
        while (number != 0) {
            /**
             * Here We will gate the last No means 6
             */
            int last = number % 10;
            /**
             * initially reverse is 0 so 0*6=0+last no is 6 so 0*6+6=6,
             *  then we have 5 6*10=60+5=65 so we have 65
             *  then again 4 65*10=650 then last 4 650+4=654 so no we have 654 like this
             */
            reverse = reverse * 10 + last;
            number = number / 10;
        }

        System.out.println( " Number is " + reverse);
    }
}
