package com.io.interview_practice;

import java.util.Comparator;

public class CustomSortingComparator implements Comparator<Person> {


    @Override
    public int compare(Person person1, Person person2) {
     int ageComparator=Integer.compare(person1.getAge(),person2.getAge());
     if (ageComparator==0){
         return person1.getName().compareTo(person2.getName());
     }
     return ageComparator;
    }
}
