package com.io.java8Interview;

/**
 * @author Shad Ahmad
 */
public class Employee {
    private int id;
    private String name;
    private int departmentId;
    private String status;
    private int salary;

    public Employee(int id, String name, int departmentId, String status, int salary) {
        this.id = id;
        this.name = name;
        this.departmentId = departmentId;
        this.status = status;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", departmentId=" + departmentId +
                ", status='" + status + '\'' +
                ", salary=" + salary +
                '}';
    }
}
