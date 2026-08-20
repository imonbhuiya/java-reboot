package org.example.dsa.HashMap;

public class HashMap<I extends Number, I1 extends Number> {
    public static void main(String[] args) {

        java.util.HashMap<String, Integer> students = new java.util.HashMap<>();
        students.put("Imon",95);
        students.put("Rahim",88);
        students.put("Karim",91);
        System.out.println(students);
        System.out.println(students.get("Imon"));
        System.out.println(students.containsKey("Rahim"));
        students.remove("Karim");
        System.out.println(students);


    }
}
