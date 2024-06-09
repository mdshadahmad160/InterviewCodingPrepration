package com.io.Java8Problems;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattedDateAndTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime=LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(dateTimeFormatter.format(localDateTime));
    }
}
