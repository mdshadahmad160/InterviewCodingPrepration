package com.io.java8Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Shad Ahmad
 */
public class FetchSStartsWith1 {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 11, 2, 8, 21, 1};
        List<String> fetchWhoseStartWith1 = Arrays.stream(numbers)
                .boxed().map(s -> s + "").filter(s -> s.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(fetchWhoseStartWith1);
    }
}
