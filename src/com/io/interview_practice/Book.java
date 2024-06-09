package com.io.interview_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Shad Ahmad
 * STREAM API INTERVIEW CODING PRACTICE
 */
public class Book {
    private String title;
    private int year;
    private double price;

    public Book(String title, int year, double price) {
        this.title = title;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Hadees", 2005, 25.5));
        books.add(new Book("Fazail-e Aamal", 1998, 40.0));
        books.add(new Book("Quran", 2010, 35.0));
        /**
         * Requirements is that  get Title of Books which published after 2000
         */
        List<String> titleAfter2000 = books.stream()
                .filter(b -> b.getYear() > 2000)
                .map(Book::getTitle)
                .collect(Collectors.toList());
        System.out.println("Titles After 2000 " + titleAfter2000.toString());
    }
}
