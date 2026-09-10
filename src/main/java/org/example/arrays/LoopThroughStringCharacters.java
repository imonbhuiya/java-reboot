package org.example.arrays;

public class LoopThroughStringCharacters {
    public static void main(String[] args) {
        String word = "backend";
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            System.out.println(current);
        }
    }
}
