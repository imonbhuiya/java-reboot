package org.example.dsa.HashMap.CountDistinctNumbers;

import java.util.HashSet;

public class Main {
    public static int countDistinct(int[] nums) {
        // Create a hash set to store unique elements
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num); // Takes O(1) time on average
        }

        return set.size(); // Returns total unique elements
    }

    public static void main(String[] args) {
        int[] num = {4, 7, 4, 2, 7, 7, 9};

        // Call the method and print the result matching your exact output
        int distinctCount = countDistinct(num);
        System.out.println("Total distinct numbers: " + distinctCount);
    }
}
