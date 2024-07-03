package com.example;

public class Car {
    private String color;
    private int maxSpeed;
    private int year;
    private String name;

    public Car(String name, String color, int maxSpeed, int year) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.year = year;
    }

    public void display() {
        System.out.println("Name: " + this.getName());
        System.out.println("Color: " + this.getColor());
        System.out.println("MaxSpeed: " + this.getMaxSpeed());
        System.out.println("Year: " + this.getYear());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public void run() {
        System.out.println("Car is running");
    }

    public void stop() {
        System.out.println("Car is stopped");
    }
}

