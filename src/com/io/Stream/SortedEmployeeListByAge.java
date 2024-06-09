package com.io.Stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class SortedEmployeeListByAge {
    public static List<Employee> employeeList = EmployeeDB.getEmployeeData();

    public static void main(String[] args) {
        List<Employee> sortedEmployeeByAge = employeeList.stream().sorted(
                Comparator.comparingInt(Employee::getAge)
        ).collect(Collectors.toList());
        System.out.println("Employee Sorted Based On Age: " + sortedEmployeeByAge);
    }
}
