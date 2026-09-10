package org.example.dsa.TwoPointers.Exercise;

public class CompairValue {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 99, 10};
        //int[] nums = {10, 20, 30, 20, 10};
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] == nums[right]) {
                left++;
                right--;
            } else {
                System.out.println("pairs not match");
                return;

            }

        }
        System.out.println("All pairs match");

    }

}
