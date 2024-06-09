package com.io.Java8Problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Using java 8 we have to find out the salary of employee
 */
public class Employee {
    private String name;
    private double salary;


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("test1", 10000);
        Employee employee2 = new Employee("test1", 10000);
        Employee employee3 = new Employee("test1", 10000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        double sum = employeeList.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println(sum);

    }
}
