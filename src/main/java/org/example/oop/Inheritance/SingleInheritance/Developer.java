package org.example.oop.Inheritance.SingleInheritance;

class Employee {

    void work() {
        System.out.println("Employee is working");
    }
}

public class Developer extends Employee {

    void code() {
        System.out.println("Developer is coding");
    }

    public static void main(String[] args) {

        Developer dev = new Developer();

        dev.work();
        dev.code();
    }
}
