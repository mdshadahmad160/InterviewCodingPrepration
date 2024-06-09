package com.io.java8Interview;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

/**
 * @author Shad Ahmad
 */
public class MostRepeatedElement {
    public static void main(String[] args) {
        int[] elements = {2, 3, 1, 4, 4, 1, 4, 333, 3, 333, 2, 2, 2, 5, 222};

        System.out.println("Original Array: " + Arrays.toString(elements));

        Function<Map<Integer, Long>, Integer> maxValuesKey = integerLongMap ->
                integerLongMap.entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue())
                        .map(Map.Entry::getKey)
                        .orElse(Integer.MAX_VALUE);

        Integer maxDuplicateValue = Arrays.stream(elements)
                .boxed()
                .collect(collectingAndThen(groupingBy(Function.identity(), counting()),
                        maxValuesKey));
        System.out.println("max duplicate value in the array " + maxDuplicateValue);

    }
}
