package com.example.pack;

public class Vessel {
    public Ship ship;

    public Vessel(String name, String color, int maxSpeed, int year) {
        ship = new Ship(name, color, maxSpeed, year);
    }

    public void display() {
        System.out.println("Name: " + ship.getName());
        System.out.println("Color: " + ship.getColor());
        System.out.println("MaxSpeed: " + ship.getMaxSpeed());
        // System.out.println("Year: " + ship.getYear()); // Error: ship.getYear() has private
        // access
    }

    public void setName(String name) {
        ship.name = name;
    }

    void setColor(String color) {
        ship.color = color;
    }

    protected void setMaxSpeed(int maxSpeed) {
        ship.maxSpeed = maxSpeed;
    }

    private void setYear(int year) {
        // ship.year = year; // Error: ship.year has private access in com.example.pack.Ship
    }

    public String getName() {
        return ship.name;
    }

    String getColor() {
        return ship.color;
    }

    protected int getMaxSpeed() {
        return ship.maxSpeed;
    }

    private int getYear() {
        // return ship.year; // Error: ship.year has private access in com.example.pack.Ship
        return 1;
    }
}
