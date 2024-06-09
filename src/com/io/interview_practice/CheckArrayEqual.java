package com.io.interview_practice;

import java.util.Arrays;

public class CheckArrayEqual {
    public static void main(String[] args) {
        //Initializing  the first array
        int a[] = {30, 25, 40};
        //Initializing  the first array
        int b[] = {30, 25, 40};
        //Store the result
        //then call Arrays.equals()method in this we can pass the parameters int a and int b to
        // compare the both it is whether to check both the arrays are equals or not
        boolean result = Arrays.equals(a, b);
        //Here Condition is going to be checked whether is result is true or false
        if (result == true) {
            System.out.println("Two  Array are equals: ");
        } else {
            System.out.println("Two  Array are  not equals: ");
        }
    }
}
