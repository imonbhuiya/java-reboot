package org.example.dsa.TwoPointers;

public class TwoPointersBasic {

    public static void main(String[] args) {

        int[] nums = {5, 10, 15, 20, 25, 30, 40, 50, 60};

        int left = 0;
        int right = nums.length - 1;


        while (left < right) {
            System.out.println(nums[left] + " " + nums[right]);

            left++;
            right--;
        }
        

    }


}