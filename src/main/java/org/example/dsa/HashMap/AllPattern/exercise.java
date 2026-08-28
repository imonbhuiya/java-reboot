package org.example.dsa.HashMap.AllPattern;

import java.util.HashMap;

public class exercise {
    public static void main(String[] args) {

        HashMap<Character, Integer> counts = new HashMap<>();
        String word = "programming";

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            if (counts.containsKey(character)) {
                int oldCount = counts.get(character);
                int newCount = oldCount + 1;
                counts.put(character, newCount);
            } else {
                counts.put(character, 1);
            }

        }
        System.out.println(counts);
    }
}

