package org.example.dsa.arrayshashing.containsduplicate;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 3, 4};
        Solution solution = new Solution();
        boolean duplicate = solution.findDuplicate(nums);
        System.out.println(duplicate);

    }

}

class Solution {
    public boolean findDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;

            }
            seen.add(num);

        }
        return false;

    }

}
