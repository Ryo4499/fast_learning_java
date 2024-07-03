package com.example;

public interface Animal {

    void eat();

    void sleep();

    default void run() {
        System.out.println("Animal is running");
    }

    static void walk() {
        System.out.println("Animal is walking");
    }
}
