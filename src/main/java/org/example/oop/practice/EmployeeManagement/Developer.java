package org.example.oop.practice.EmployeeManagement;

public class Developer extends Employee {

  private   String programmingLanguage;//  Encapsulation


    public Developer(String name, double salary, String programmingLanguage)
    {
        super(name, salary); //  Parent constructor
        this.programmingLanguage = programmingLanguage; // Child field
    }

    public  String getProgrammingLanguage()
    {
        return programmingLanguage; // Getter
    }
    @Override
    public void work(){
        System.out.println("Developer is writing Java code");
    }
}
