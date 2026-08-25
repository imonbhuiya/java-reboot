package org.example.dsa.TwoSum;

import java.util.HashMap;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int needed = target - current;

            if (seen.containsKey(needed)) {
                return new int[] { seen.get(needed), i };
            }

            seen.put(current, i);
        }
        //return value...

        return new int[] {};
    }
}

