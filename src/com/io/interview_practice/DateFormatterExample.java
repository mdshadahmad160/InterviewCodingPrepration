package com.io.interview_practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class DateFormatterExample {
    public static void main(String[] args) {
        List<String> dateStrings = List.of(
                "2023-01-15",
                "2023-02-20",
                "2023-03-25"
        );
        /**
         * Requirements: We have to Convert the List of DATES into the list
         * Of Date Formatter
         */
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                "yyyy-MM-dd"
        );
        List<LocalDate> updatedDates = dateStrings.stream()
                .map(dateStr -> LocalDate.parse(dateStr, formatter))
                .collect(Collectors.toList());
        System.out.println("Updated Dates are: ");
        updatedDates.forEach(System.out::println);
    }
}
