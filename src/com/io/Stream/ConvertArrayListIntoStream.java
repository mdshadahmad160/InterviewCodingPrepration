package com.io.Stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shad Ahmad
 */

public class ConvertArrayListIntoStream {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("shad");
        stringList.add("zohan");
        stringList.add("shazain");
        stringList.add("ahmad");
        /**
         * Display the record that would be start with 's' in stringList
         */
        System.out.println("1:- Used Stream for filtering and stream with start with letter s: ");
        stringList.stream().filter(s -> s.startsWith("s")).forEach(
                System.out::println
        );
        System.out.println("****************************************");
        /**
         * Display all the record in the sorted manner (ascending order) that would be start with s
         */
        System.out.println("2:- Used Stream for filtering, sorting and display in the ascending " +
                "whose name start with s letter: ");
        stringList.stream().filter(s -> s.startsWith("s")).sorted()
                .forEach(System.out::println);
        System.out.println("****************************************");

        /**
         *  Display all the record in the sorted manner (descending order) that would be start with s
         */

        System.out.println("3:- Used Stream for filtering, sorting and display in the descending " +
                "whose name start with s letter: ");
        stringList.stream().filter(s -> s.startsWith("s")).sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);

        System.out.println("****************************************");


        /**
         *  Display all the record in the Upper Case that would be start with s
         */
        System.out.println("4:- Used Stream for filtering,uppercase, sorting and display  " +
                "whose name start with s letter: ");
        stringList.stream().filter(s -> s.startsWith("s")).map(String::toUpperCase)
                .sorted().forEach(System.out::println);

        System.out.println("****************************************");

        /**
         * Check whether any record start with "s" letter using inbuilt method of stream api
         */
        boolean startWithS = stringList.stream().anyMatch(s -> s.startsWith("s"));
        System.out.println("Any Record Start with S Letter:   " + startWithS);


        System.out.println("****************************************");
        /**
         *  Check whether none of the record start with "b" letter using inbuilt method of stream api
         */
        boolean startWithB = stringList.stream().noneMatch(s -> s.startsWith("b"));
        System.out.println("Non Of Record Start With B Letter: " + startWithB);

        System.out.println("****************************************");


        /**
         * Display the count of name whose start with s
         */
        long count = stringList.stream().filter(s -> s.startsWith("s")).count();
        System.out.println("Count of name whose start with S Letter : " + count);

    }
}
