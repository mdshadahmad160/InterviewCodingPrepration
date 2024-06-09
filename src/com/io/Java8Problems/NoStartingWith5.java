package com.io.Java8Problems;

import java.util.Arrays;
import java.util.List;

/**
 * @author Shad Ahmad
 */

public class NoStartingWith5 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 12, 22, 5, 100, 13, 55, 53);
        /**
         * We need to find out the no which is starting with 5 only
         * 1ts we need to convert it the stream then we have to use Filter method
         * as a predicated to reduce the boilerplate code then we need to convert the
         * number(Integer) into String value then we can make use of startWith method
         * And we can pass the no over there
         */
        nums.stream().filter(num -> num.toString().startsWith("5"))
                .forEach(System.out::println);

    }
}
