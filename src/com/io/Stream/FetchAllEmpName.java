package com.io.Stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Shad Ahmad
 * Fetch all employee name from the employee list
 */

public class FetchAllEmpName {
    public static List<Employee> employeeList = EmployeeDB.getEmployeeData();

    public static void main(String[] args) {
        //1.Get all the employee names from the employee list - use of map

        List<String> employeeName = employeeList.stream().map(employee -> employee.getName())
                .collect(Collectors.toList());
        System.out.println(" All Employee Name : " + employeeName);

    }
}
