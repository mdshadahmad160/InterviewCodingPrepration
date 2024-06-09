package com.io.Stream;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

/**
 * @author Shad Ahmad
 */

public class CreateDoubleStreamAndUseReduceMethod {
    public static void main(String[] args) {
        System.out.println("Create Double Stream: ");
        DoubleStream doubleStream = DoubleStream.of(1.1, 2.2, 3.3);
        System.out.println("Use reduce () method to calculate sum of double in DoubleStream: ");
        OptionalDouble optionalDouble = doubleStream.reduce((i1, i2) -> i1 + i2);
        System.out.println("Sum : " + optionalDouble.getAsDouble());
    }
}
