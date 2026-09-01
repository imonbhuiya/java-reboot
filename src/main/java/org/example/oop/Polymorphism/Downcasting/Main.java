package org.example.oop.Polymorphism.Downcasting;


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
    static void main() {
        //Upcasting
        Employee employee = new Developer();
        employee.work();

        //Downcasting
        Developer developer = (Developer) employee;
        developer.work();
        developer.writeJava();


    }

}
