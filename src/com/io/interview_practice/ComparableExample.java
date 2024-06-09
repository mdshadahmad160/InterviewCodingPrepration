package com.io.interview_practice;

import java.util.Arrays;

/**
 * @author Shad Ahmad
 * @apiNote In this Example @link {Employee} class implements  Comparable Interface,
 * And then Comparing objects based on their id,
 * The Arrays.sort() method is then used to sort an array of Employee objects based on the id
 */

public class ComparableExample {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Alice", 25),
                new Employee("Bob", 20),
                new Employee("Charlie", 30)
        };
        /**
         * Sorting the Array Employee objects based on Id
         */
        Arrays.sort(employees);
        /**
         * Printing the sorted Array
         */
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
