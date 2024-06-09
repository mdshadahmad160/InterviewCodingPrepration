package com.io.interview_practice;

import java.util.*;

public class UniqueEmployee {
    private String employeeName;
    private String employeeCode;

    public UniqueEmployee(String employeeName, String employeeCode) {
        this.employeeName = employeeName;
        this.employeeCode = employeeCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniqueEmployee employee = (UniqueEmployee) o;
        return Objects.equals(employeeName, UniqueEmployee.employeeName) &&
                Objects.equals(employeeCode, employee.employeeCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(employeeName, employeeCode);
    }*/

    public static void main(String[] args) {
        List<UniqueEmployee> list1 = new ArrayList<>();
        list1.add(new UniqueEmployee("John", "E001"));
        list1.add(new UniqueEmployee("Alice", "E002"));
        list1.add(new UniqueEmployee("Bob", "E003"));

        List<UniqueEmployee> list2 = new ArrayList<>();
        list1.add(new UniqueEmployee("John", "E001"));
        list1.add(new UniqueEmployee("Alice", "E002"));
        list1.add(new UniqueEmployee("Bob", "E003"));


        Set<UniqueEmployee> set1 = new HashSet<>(list1);
        Set<UniqueEmployee> set2 = new HashSet<>(list2);
        if (set1.size() == list1.size()) {
            System.out.println("All employees in list1 are unique.");
        } else {
            System.out.println("There are duplicate employees in list1.");
        }

        if (set2.size() == list2.size()) {
            System.out.println("All employees in list2 are unique.");
        } else {
            System.out.println("There are duplicate employees in list2.");
        }
    }
}
