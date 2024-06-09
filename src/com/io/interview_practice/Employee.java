package com.io.interview_practice;

/**
 * Comparable Interface
 */

public class Employee implements Comparable<Employee> {
    private String name;
    private int id;

    public Employee(String name,int id){
        this.name=name;
        this.id=id;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        //compare based on id
        return Integer.compare(this.id,employee.id);
    }
}
