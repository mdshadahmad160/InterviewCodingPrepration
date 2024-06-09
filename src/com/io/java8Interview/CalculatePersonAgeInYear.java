package com.io.java8Interview;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author Shad Ahmad
 * Calculate the age of a person in years
 * Write a Java 8 program to calculate the age of a person in years given their birthday.
 */

public class CalculatePersonAgeInYear {

    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1998, 8, 17);
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(birthDate, currentDate).getYears();
        System.out.println("Age of the Person is: " + age);
    }
}
