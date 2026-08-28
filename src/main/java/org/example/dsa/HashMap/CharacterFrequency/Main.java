package org.example.dsa.HashMap.CharacterFrequency;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String word = "banana";

        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            if (count.containsKey(current)) {
                count.put(current, count.get(current) + 1);


            } else {
                count.put(current, 1);

            }

        }
        System.out.println(count);

    }
}
