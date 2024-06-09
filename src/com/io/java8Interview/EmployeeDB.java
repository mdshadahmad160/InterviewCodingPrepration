package com.io.java8Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDB {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "Shad", 101, "active", 2000));
        employeeList.add(new Employee(102, "Akash", 102, "Non-active", 5000));
        employeeList.add(new Employee(103, "Rahul", 103, "active", 3000));
        employeeList.add(new Employee(104, "Golu", 104, "Non-active", 6000));
        employeeList.add(new Employee(105, "Zohan", 105, "active", 1000));
        employeeList.add(new Employee(106, "Zeeshan", 106, "active", 9000));
        employeeList.add(new Employee(107, "Aasiya", 107, "Non-active", 10000));


       /* Map<Integer, List<Employee>> employeeBasedOnDeptId = employeeList.stream().collect(Collectors.groupingBy(
                Employee::getDepartmentId, Collectors.toList()));

        employeeBasedOnDeptId.entrySet().forEach(entry-> {
            System.out.println(entry.getKey() + "--------" + entry.getValue());
        });
        */

        /**
         * convert List<Employee> to Map<Integer,String> where key will be
         * employee id and value will be employee name using java 8 stream
         */


        Map<Integer, String> employee = employeeList.stream()
                .collect(Collectors.toMap(Employee::getId, Employee::getName));
       // System.out.println(employee);


        /**
         * convert List<Employee> to Map<Integer,List<Employee>> where key will be salary and value will be
         * List<Employee> correspondent to the salary
         */
        Map<Integer,List<Employee>> employeeSalary=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getSalary));

        System.out.println(employeeSalary);


    }
}
