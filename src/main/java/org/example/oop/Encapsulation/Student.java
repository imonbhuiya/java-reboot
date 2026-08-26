package org.example.oop.Encapsulation;

public class Student {

    // Fields
    String name;
    private int age;       // Encapsulated / protected
    String department;


    public int getAge() {
        return age;
    }
    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
    }

    // Parameterized constructor
    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }


    // Method
    void introduce() {
        System.out.println(
                "My name is " + name +
                        ", I am " + age +
                        " years old, my department is " + department
        );
    }
}