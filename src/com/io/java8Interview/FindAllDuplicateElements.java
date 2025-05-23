package com.io.java8Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Shad Ahmad
 */
public class FindAllDuplicateElements {
    public static void main(String[] args) {
        String input = "shadahmad";

        List<String> duplicateElements = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(duplicateElements);

    }
}
