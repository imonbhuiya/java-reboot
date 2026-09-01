package org.example.oop.Polymorphism;

class Employee {

    public void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {

    @Override
    public void work() {
        System.out.println("Developer is writing code");
    }

    public void writeJava() {
        System.out.println("Developer is writing Java");
    }
}

public class Main {

    public static void main(String[] args) {

        Employee employee = new Developer();

        employee.work();
    }
}