package org.example.dsa.HashMap.AllPattern;

import java.util.HashMap;

public class PhoneBook {

    public static void main(String[] args) {

        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Imon ", " +491919191992");
        phoneBook.put("Rahim ", " +491234566766");
        phoneBook.put("Karim ", " +492327373664");

        System.out.println(phoneBook);

        System.out.println(phoneBook.get("Imon"));

        System.out.println(phoneBook.containsKey("Alice"));

        phoneBook.remove("Karim");

        System.out.println(phoneBook);

    }
}