package com.io.Java8Problems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOnlyDuplicateElements {
    public static void main(String[] args) {
        /**
         * How to find Only duplicate elements with its count from the String ArrayList in java 8
         */
        List<String> words= Arrays.asList("Dev","Bytes","School","Dev","Bytes");
        //Here we use map so that whatever the result we were got we acn store over
        //Key and value pairs like dev and 2 like that
        /**
         * Steps 1: we need to convert the words into Stream
         * Step2: then we can collect the words using Collect inside this method
         * we can call Collectors method and check each words by groupingBy() method
         * and then last count
         * Steps3: we have map means key value pair
         * so for we can convert into stream and pass filter condition for this
         * we have to use lambdas expression and check words is greater than
         * then it is duplicates and print them with the key and values pair
         * So the output : Bytes : 2 ,Dev=2
         */
        Map<String,Long> map=words.stream().collect(Collectors.groupingBy(
                s->s,Collectors.counting()));
        map.entrySet().stream().filter(m-> m.getValue()>1).forEach(
                m-> System.out.println(m.getKey() + " : " + m.getValue())
        );
    }
}
