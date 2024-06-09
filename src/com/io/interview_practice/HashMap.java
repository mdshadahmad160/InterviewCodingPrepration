package com.io.interview_practice;

import java.util.Map;

/**
 * @author Shad Ahmad
 */
public class HashMap {
    public static void main(String[] args) {
        // Creating a new HashMap with String Keys and String Value
        Map<String, String> countryCapitalMap = new java.util.HashMap<>();
        //Adding Key-value pairs
        countryCapitalMap.put("USA", "Washington D.C ");
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Japan", "Tokyo");
        //Retrieving values using keys
        String capitalOfIndia = countryCapitalMap.get("India");
        System.out.println(capitalOfIndia);
        //Iterating through key value pairs
        for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
            System.out.println("Capital Of " + entry.getKey() + ": " + ": " + entry.getValue());
        }
    }
}
