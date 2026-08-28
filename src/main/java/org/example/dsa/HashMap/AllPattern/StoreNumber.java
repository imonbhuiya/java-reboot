package org.example.dsa.HashMap.AllPattern;

import java.util.HashMap;

public class StoreNumber {
    public static void main(String[] args) {
        int[] nums = {4, 7, 2, 7, 9};
        HashMap<Integer, Integer> counts = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (counts.containsKey(current)) {
                System.out.println("Duplicate found: " + current);
            } else {
                counts.put(current, i);
            }
        }
    }
}
