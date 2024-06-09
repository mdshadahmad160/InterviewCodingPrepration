package com.io.Java8Problems;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Shad Ahmad
 */
public class OccurrenceCharacter {

    public static void main(String[] args) {
        /**
         * We have to find out the how many characters are present
         * like this s=1,h=2,a=3,d=2,m=1
         */
        String input = "shadahmad";
        //String[] arr =input.split("");
        Map<String, Long> occurrenceOfCharacters = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Occurrence Of Characters are : " + occurrenceOfCharacters);


    }
}
