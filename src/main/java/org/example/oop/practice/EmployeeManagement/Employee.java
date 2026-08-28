package org.example.oop.practice.EmployeeManagement;

public class Employee {
    private String name;
    private double salary;

   public void work(){
        System.out.println("Employee is working");
    }
    //Constructor
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;

    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void increaseSalary(double amount) {
        // your logic
        if(amount > 0){
            salary += amount;        }
    }
}


