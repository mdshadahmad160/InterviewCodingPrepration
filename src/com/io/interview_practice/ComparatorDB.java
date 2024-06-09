package com.io.interview_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ComparatorDB {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 20));
        people.add(new Person("David", 25));

        Collections.sort(people, new CustomSortingComparator());
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
