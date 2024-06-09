package com.io.java8Interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Shad Ahmad
 */
public class FirstNonRepeatingElements {
    public static void main(String[] args) {
        String input = "ilovejavatechie";

        String firstNonRepeatingElements = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println(firstNonRepeatingElements);

    }
}
