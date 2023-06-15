package com.example.springboot.model;

public class Car {
    private String color;
    private int year;
    private int milesDriven;

    // No-arg constructor
    public Car() {
    }

    // All-args constructor
    public Car(String color, int year, int milesDriven) {
        this.color = color;
        this.year = year;
        this.milesDriven = milesDriven;
    }

    // Getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMilesDriven() {
        return milesDriven;
    }

    public void setMilesDriven(int milesDriven) {
        this.milesDriven = milesDriven;
    }
}