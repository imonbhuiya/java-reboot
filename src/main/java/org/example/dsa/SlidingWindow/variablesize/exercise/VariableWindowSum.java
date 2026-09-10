package org.example.dsa.SlidingWindow.variablesize.exercise;

public class VariableWindowSum {
    public static void main(String[] args) {
        int[] nums = {2, 1, 2, 1, 1};
        int limit = 4;
        Solution solution = new Solution();
        int result = solution.solve(nums, limit);
        System.out.println(result);

    }
}

class Solution {
    public int solve(int[] nums, int limit) {
        int windowSum = 0, left = 0;
        int maxSize = 0;
        for (int right = 0; right < nums.length; right++) {
            windowSum += nums[right];
            while (windowSum > limit) {
                windowSum -= nums[left];
                left++;

            }
            int currentSize = right - left + 1;
            maxSize = Math.max(maxSize, currentSize);
        }
        return maxSize;
    }

}
