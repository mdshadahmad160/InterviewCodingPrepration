package com.io.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Shad Ahmad
 * Java program to count the occurrence of each character in a String
 * Ex: ilovejavatechie
 * Output should be like this:
 * a=2,c=1,t=1,e=3,v=2,h=1,i=2,j=1,l=1,o=1
 */

public class OccurrenceOfEachCharacter {
    public static void main(String[] args) {
        String input = "ilovejavatechie";
        /**
         * First we need to convert String to the Array like this
         * ["i","l","o","v".............]
         * for that we have split method
         */
        //String[] results = input.split("");

        Map<String, Long> map = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);


    }

}
