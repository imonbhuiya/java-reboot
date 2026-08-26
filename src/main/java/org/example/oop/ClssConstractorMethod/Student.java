package org.example.oop.ClssConstractorMethod;


public class Student {

    //Fields
     String name;
     int age;
     String department;


     Student(){

     }

     Student(String name){
         this.name = name;

     }

     //Constructor
    public Student(String name, int age, String department) {
        
        this.name = name;
        this.age = age;
        this.department = department;
        
    }

    

    //Method

    void instroduce(){
        System.out.println(
                "My name is " + name +
                        ", I am " + age +
                        " years old my department is " + department
        );
    }


  //Main function
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Alex" );
        Student s3 = new Student("Sara" ,22,"IT");
        s1.instroduce();
        s2.instroduce();
        s3.instroduce();
    }

}