package com.io.interview_practice;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Project {
    private int id;
    private String details;
    private LocalDate startDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Project(int id, String details, LocalDate startDate) {
        this.id = id;
        this.details = details;
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", details='" + details + '\'' +
                ", startDate=" + startDate +
                '}';
    }

    public static void main(String[] args) {
        List<Project> projects = List.of(
                new Project(1, "E-Commerce website", LocalDate.of(2024, 3, 15)),
                new Project(2, "Student Management", LocalDate.of(2024, 3, 20)),
                new Project(3, "Telecom Project", LocalDate.of(2024, 4, 5)),
                new Project(4, "Banking Project", LocalDate.of(2024, 4, 10)),
                new Project(5, "Library Management", LocalDate.of(2024, 4, 15)),
                new Project(6, "School Website", LocalDate.of(2024, 5, 2)));

        LocalDate startDate = LocalDate.of(2024, 4, 1);
        LocalDate endDate = LocalDate.of(2024, 4, 30);
        /**
         * Requirements: We need to Find Which Projects Are Starting in the MONTH OF APRIL that menas
         * Between 1 APRIL TO 30th April
         */

        List<Project> filteredProjects = projects.stream()
                .filter(project -> project.getStartDate().compareTo(startDate) >= 0 && project.getStartDate().compareTo(endDate) <= 0)
                .collect(Collectors.toList());
        System.out.println("Final Project List");
        filteredProjects.forEach(System.out::println);

    }
}
