package com.io.Stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * @author Shad Ahmad
 */

public class CreateIntStreamAndUseReduceMethod {
    public static void main(String[] args) {
        System.out.println("Create IntStream: ");
        IntStream intStream = IntStream.of(1, 2, 3, 4);
        System.out.println("Use reduce () method to calculate sum of int in IntStream: ");
        OptionalInt optionalInt = intStream.reduce((s1, s2) -> s1 + s2);
        System.out.println("Sum of IntStream: " + optionalInt.getAsInt());

    }
}
