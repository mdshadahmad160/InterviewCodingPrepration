package com.io.Stream;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeePhoneList {

    public static List<Employee> employeeList = EmployeeDB.getEmployeeData();

    public static void main(String[] args) {
        List<String> employeePhone = employeeList.stream()
                .flatMap(employee -> employee.getPhone().stream())
                .collect(Collectors.toList());
        System.out.println("List Of Employee Phone :  " + employeePhone);
    }
}
