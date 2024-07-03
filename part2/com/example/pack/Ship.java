package com.example.pack;

public class Ship {
    public String name;
    protected int maxSpeed;
    private int year;
    String color;

    public Ship(String name, String color, int maxSpeed, int year) {
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

    void setColor(String color) {
        this.color = color;
    }

    protected void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    String getColor() {
        return color;
    }

    protected int getMaxSpeed() {
        return maxSpeed;
    }

    private int getYear() {
        return year;
    }
}
