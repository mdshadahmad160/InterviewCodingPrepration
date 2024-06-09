package com.io.interview_practice;

/**
 * @author Shad Ahmad
 */
public class SumOfDigit {
    public static void main(String[] args) {
        int number=12345;
        int sum=0;
        while (number!=0){
            int last=number%10;
            sum=sum+last;
            number=number/10;

        }
        System.out.println(sum);
    }

}
