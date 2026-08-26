package org.example.oop.Inheritance;

public class Developer extends Employee {

    String programmingLanguage;

    public Developer(String name, int age, String programmingLanguage){
        super(name, age);
        this.programmingLanguage = programmingLanguage;
    }

    void writeCode() {
        System.out.println("Developer is coding");
    }

    public static void main(String[] args) {

        Developer dev1 = new Developer("Alex",25, "Java");

        System.out.println(dev1.name);
        System.out.println(dev1.age);
        System.out.println(dev1.programmingLanguage);

        dev1.work();
        dev1.writeCode();
    }
}