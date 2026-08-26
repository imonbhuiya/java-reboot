package org.example.oop.Inheritance;

public class Employee {

    String name;
    int age;

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    void work() {
        System.out.println("Employee is working");
    }
}