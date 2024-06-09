package com.io.interview_practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Product {
    private String name;
    private double price;
    private boolean hasDiscount;

    public Product(String name, double price, boolean hasDiscount) {
        this.name = name;
        this.price = price;
        this.hasDiscount = hasDiscount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasDiscount() {
        return hasDiscount;
    }

    public void setHasDiscount(boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public static void main(String[] args) {
        List<Product> proudcts = List.of(
                new Product("Laptop", 1200.0, true),
                new Product("Phone", 800.0, false),
                new Product("Tablets", 500.0, true),
                new Product("Watch", 300.0, false));
        /**
         * Requirements is that Write a java program to get only discount product
         */
        Map<String, Double> discountedProducts = proudcts.stream()
                .filter(Product::isHasDiscount)
                .collect(Collectors.toMap(
                        Product::getName, Product::getPrice
                ));
        System.out.println(discountedProducts);
    }
}
