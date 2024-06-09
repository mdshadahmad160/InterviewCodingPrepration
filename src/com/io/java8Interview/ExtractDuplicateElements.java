package com.io.java8Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Shad Ahmad
 */
public class ExtractDuplicateElements {
    public static void main(String[] args) {
        List<Integer> duplicateElements = Arrays.asList(1, 2, 2, 2, 3, 3, 4, 5, 1, 1, 56, 7, 8, 9, 10);
        System.out.println("Maxed Elements: " + duplicateElements);

        List<Integer> extractDuplicateElements = duplicateElements.stream()
                .filter(element -> duplicateElements.indexOf(element)
                        != duplicateElements.lastIndexOf(element))
                .distinct()
                .collect(Collectors.toList());

        System.out.println("extract duplicates elements from " + extractDuplicateElements);

    }
}
