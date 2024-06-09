package com.io.Java8Problems;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * How to check if list is empty in java 8 using  Optional
 * id not null iterate through the list and print the object
 */

public class OptionalClassExample {
    public static void main(String[] args) {
        List<String> list =Arrays.asList("Dev", "Bytes", "School");
        Optional<List<String>> checkNullList = Optional.ofNullable(list);
        checkNullList.ifPresentOrElse(
                i -> i.stream().forEach(System.out::println),
                () -> System.out.println("the list is empty")
        );


    }
}
