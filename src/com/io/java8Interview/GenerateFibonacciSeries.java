package com.io.java8Interview;

import com.sun.source.tree.UsesTree;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Shad Ahmad
 */
public class GenerateFibonacciSeries {
    public static void main(String[] args) {
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(10)
                .map(t -> t[0])
                .forEach(System.out::println);
        /**
         * 2nd way
         */
        Function<int[], List<Integer>> intArrayToListOFInt = array -> Arrays
                .stream(array).boxed().collect(Collectors.toList());
        List<Integer> collect = Stream.iterate(new int[]{0, 1}, t -> new int[]
                        {t[1], t[0] + t[1]})
                .limit(10).map(intArrayToListOFInt)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
