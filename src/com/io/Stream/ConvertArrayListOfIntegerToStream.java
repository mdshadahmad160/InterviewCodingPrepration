package com.io.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ConvertArrayListOfIntegerToStream {
    public static void main(String[] args) {
        System.out.println("Step 1:- Creating List of Integer : ");
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);

        System.out.println("Step 2:- Converting List (ArrayList) of Integer To Stream");

        Stream<Integer> integerStream = list.stream();

        System.out.println("Step 3:- Display Stream of Integer: ");
        integerStream.forEach(System.out::println);
    }
}
