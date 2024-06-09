package com.io.interview_practice;

import java.util.HashMap;
import java.util.Map;

public class CheckUniquenessOfHashMap {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        System.out.println(map);
        //Trying to Add key value pair with the duplicate key
        map.put(2," New Two");//This will OverWrite the existing value
        System.out.println(map);
    }
}
