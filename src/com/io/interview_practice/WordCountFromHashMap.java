package com.io.interview_practice;

import java.util.HashMap;
import java.util.Map;

public class WordCountFromHashMap {
    public static void main(String[] args) {
        //Declare a String
        String str = "Alice is girl and Bob is boy";
        //Declaring a Hashmap of <String,Integer>
        Map<String, Integer> hashMap = new HashMap<>();
        //Splitting the words of string and storing them in an array
        String[] words = str.split(" ");
        for (String word : words) {
            //Asking whether the hashmap contains the key of not,will return null if not
            Integer integer = hashMap.get(word);
            if (integer == null) {
                //Storing the word as key and its endurance as value in the HashMap
                hashMap.put(word, 1);
            } else {
                //Incrementing the  value if the word is already present in the hashmap
                hashMap.put(word, integer + 1);
            }
        }
        System.out.println(hashMap);
    }
}
