package com.io.java8Interview;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Shad Ahmad
 */
public class OccurrenceCharacter {
    public static void main(String[] args) {
        String input = "shadahmad";

        Map<String, Long> occurrenceOfCharacter = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(occurrenceOfCharacter);
    }
}
