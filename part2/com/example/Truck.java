package com.example;


public class Truck extends Car {
    private int loadCapacity;

    public Truck(String name, String color, int maxSpeed, int year, int loadCapacity) {
        super(name, color, maxSpeed, year);
        this.loadCapacity = loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getName() {
        // return super.name; // private field name is not accessible
        return "Truck name: " + super.getName();
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void run() {
        super.run();
        System.out.println("Truck is running");
    }

    public void stop() {
        System.out.println("Truck is stopped");
    }
}
