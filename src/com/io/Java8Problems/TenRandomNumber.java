package com.io.Java8Problems;

import java.util.Random;
import java.util.stream.Stream;

public class TenRandomNumber {
    public static void main(String[] args) {
        /**
         * VIP QUESTION
         */
        //Random is used to generate random no which we are used in java 8
        //Create a random object
        Random random = new Random();
        //here we can user Stream then call generate method to
        //generate  random numbers which is integer so for this we can call
        //method reference  to reduce the boilerplate code then fix the limit
        //where we can generate the random no then print them using for each method
        Stream.generate(random::nextInt).limit(10).forEach(System.out::println);
    }
}
