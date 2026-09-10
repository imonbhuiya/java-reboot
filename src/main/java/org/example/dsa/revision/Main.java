package org.example.dsa.revision;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        int[] nums = {4, 7, 2, 9};
        int target = 11;

        Solution solution = new Solution();

        int[] result = solution.solve(nums, target);

        System.out.println(result[0] + ", " + result[1]);
    }
}


class Solution {

    public int[] solve(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int current = nums[i];
            int needed = target - current;

            // CHECK FIRST
            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }

            // STORE SECOND
            map.put(current, i);
        }

        return new int[]{};
    }
}
