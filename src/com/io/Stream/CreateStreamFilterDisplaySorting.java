package com.io.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Shad Ahmad
 */
public class CreateStreamFilterDisplaySorting {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("ank");
        stringList.add("sam");
        stringList.add("az");
        stringList.add("neh");
        stringList.add("ad");

        Stream<String> stream = stringList.stream();
        /**
         * Display all record that start with 'a' in stream
         */
        System.out.println("1. Use Stream of Filter to find out the record whose start with letter a: ");
        stream.filter(s -> s.startsWith("a")).forEach(System.out::println);
        //2nd way
        stream = stringList.stream();
        System.out.println("2. Use Stream of Filter to find out the record whose start with letter a: ");
        stream.filter(s -> s.startsWith("a")).forEach(
                s -> System.out.println("Value: " + s)
        );
        //3rd way
        stream = stringList.stream();
        System.out.println("3. Use Stream of Filter to find out the record whose start with letter a: ");
        stream.forEach(s -> {
            if (s.startsWith("a"))
                System.out.println(s);
        });
        /**
         * Display all record (in sorted manner - ASCENDING) that starts with "a" in the stream
         */
        stream = stringList.stream();
        System.out.println("4. Use Stream for filtering ,sorting and display (in sorted-manner - ASCENDING order)");
        stream.filter(s -> s.startsWith("a")).
                sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);

    }
}
