package com.example;

abstract class InnerUser {
    private String name;
    private int age;
    protected String email;
    public String phone;

    abstract void setName(String name);

    abstract void setAge(int age);

    abstract void setEmail(String email);

    abstract void setPhone(String phone);

    abstract String getName();

    abstract int getAge();

    abstract String getEmail();

    abstract String getPhone();
}


public class User extends InnerUser {
    private String name;
    private int age;
    protected String email;
    public String phone;

    public User(String name, int age, String email, String phone) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
