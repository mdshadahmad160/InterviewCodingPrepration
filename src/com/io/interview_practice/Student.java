package com.io.interview_practice;

import java.sql.ClientInfoStatus;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Shad Ahmad
 */
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String departmentName;
    private String joinedYear;
    private String city;
    private int rank;

    public Student(int id, String firstName, String lastName, int age, String gender, String departmentName,
                   String joinedYear, String city, int rank) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.departmentName = departmentName;
        this.joinedYear = joinedYear;
        this.city = city;
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getJoinedYear() {
        return joinedYear;
    }

    public void setJoinedYear(String joinedYear) {
        this.joinedYear = joinedYear;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", joinedYear='" + joinedYear + '\'' +
                ", city='" + city + '\'' +
                ", rank=" + rank +
                '}';
    }

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(1, "Aditya", "Mall", 30, "Male", "Mechanical Engineering", "2014", "Mumbai", 122),
                new Student(2, "Pulkith", "Singh", 26, "Male", "Computer Engineering", "2018", "Delhi", 67),
                new Student(3, "Ankita", "Patil", 25, "Female", "Computer Engineering", "2019", "Kerala", 164),
                new Student(4, "Satish", "Malaghan", 30, "Male", "Mechanical Engineering", "2014", "Kerala", 26),
                new Student(5, "Darshan", "Mukd", 23, "Male", "Instrumentation Engineering", "2022", "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", "2023", "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", "2014", "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", "2014", "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", "2018", "Karnataka", 7),
                new Student(10, "Satya", "Pandey", 26, "Male", "Biotech Engineering", "2017", "Mumbai", 98));
        /**
         * Group the Students by department names
         */
        Map<String, List<Student>> collect = list.stream()
                .collect(Collectors.groupingBy(Student::getDepartmentName));
        System.out.println("Student Group by Department names: " + collect);

        /**
         * Find the Count of Students in each Department
         */
        Map<String, Long> countStudent = list.stream().collect(Collectors.groupingBy(Student::getDepartmentName,
                Collectors.counting()));
        System.out.println(countStudent);

        /**
         * Find out all Department Names
         */
        List<String> deptNames = list.stream()
                .map(t -> t.getDepartmentName()).distinct()
                .collect(Collectors.toList());
        System.out.println(deptNames);
        /**
         * Find out the List of Student whose age is less than 25
         */
        List<Student> listOfStudent = list.stream()
                .filter(t -> t.getAge() < 25)
                .collect(Collectors.toList());
        System.out.println(listOfStudent);

        /**
         * find the max age of Student
         */
        OptionalInt max = list.stream().mapToInt(t -> t.getAge()).max();
        System.out.println(max.getAsInt());

        /**
         * Find Out the Average of Student
         */
        Map<String, Double> averageAgeStudent = list.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(
                        Student::getAge
                )));
        System.out.println("Average Of Student : " + averageAgeStudent);

    }

}
