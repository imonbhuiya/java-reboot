package org.example.dsa.HashMap.AllPattern;

import java.util.HashMap;

public class checkAnagram {

    // Your original anagram method
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> charCounts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);

            if (charCounts.containsKey(letter)) {
                int oldCount = charCounts.get(letter);
                int newCount = oldCount + 1;
                charCounts.put(letter, newCount);
            } else {
                charCounts.put(letter, 1);
            }

            char letter2 = t.charAt(i);

            if (charCounts.containsKey(letter2)) {
                int oldCount = charCounts.get(letter2);
                int newCount = oldCount - 1;
                charCounts.put(letter2, newCount);
            } else {
                charCounts.put(letter2, -1);
            }
        }

        for (int count : charCounts.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    // Main method to execute and test the code
    public static void main(String[] args) {
        checkAnagram solution = new checkAnagram();

        // Test Case 1: Should print true
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Are '" + s1 + "' and '" + t1 + "' anagrams? " + solution.isAnagram(s1, t1));

        // Test Case 2: Should print false
        String s2 = "rat";
        String t2 = "car";
        System.out.println("Are '" + s2 + "' and '" + t2 + "' anagrams? " + solution.isAnagram(s2, t2));
    }
}

