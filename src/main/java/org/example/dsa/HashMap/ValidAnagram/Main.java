package org.example.dsa.HashMap.ValidAnagram;

import java.util.HashMap;

public class Main {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;

        }


        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentS = s.charAt(i);
            if (countS.containsKey(currentS)) {
                countS.put(currentS, countS.get(currentS) + 1);
            } else {
                countS.put(currentS, 1);
            }

        }
        for (int i = 0; i < t.length(); i++) {
            char currentT = t.charAt(i);
            if (countT.containsKey(currentT)) {
                countT.put(currentT, countT.get(currentT) + 1);

            } else {
                countT.put(currentT, 1);
            }

        }


        return countS.equals(countT);
    }
}