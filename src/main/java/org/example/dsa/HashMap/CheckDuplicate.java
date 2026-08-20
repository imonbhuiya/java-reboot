package org.example.dsa.HashMap;

import java.util.HashSet;

class Solution {
    // The method that checks for duplicates
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i])) {
                return true;
            }
            seen.add(nums[i]);
        }
        return false;
    }

    // The main method to print the output
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1: Has duplicates (1 appears twice)
        int[] test1 = {1, 2, 3, 1};
        System.out.println("Array [1, 2, 3, 1] has duplicate? -> " + solution.hasDuplicate(test1));

        // Test Case 2: No duplicates
        int[] test2 = {1, 2, 3, 4};
        System.out.println("Array [1, 2, 3, 4] has duplicate? -> " + solution.hasDuplicate(test2));
    }
}
