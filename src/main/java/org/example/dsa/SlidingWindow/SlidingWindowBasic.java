package org.example.dsa.SlidingWindow;

public class SlidingWindowBasic {

    public static void main(String[] args) {

        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        Solution solution = new Solution();

        double result = solution.findMaxAverage(nums, k);

        System.out.println(result);
    }
}


class Solution {

    public double findMaxAverage(int[] nums, int k) {

        double windowSum = 0;

        // Calculate the first window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        double max = windowSum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {

            windowSum = windowSum - nums[i - k] + nums[i];

            max = Math.max(max, windowSum);
        }

        return max / k;
    }
}