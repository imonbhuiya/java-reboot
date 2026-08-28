package org.example.dsa.HashMap.mostFrequent;

import java.util.HashMap;

public class Main {

    public static int mostFrequent(int[] nums) {

        HashMap<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (count.containsKey(nums[i])) {
                count.put(nums[i], count.get(nums[i]) + 1);
            } else {
                count.put(nums[i], 1);
            }
        }
        int maxFrequency = 0;
        int mostFrequentNumber = 0;
        for (int num : count.keySet()) {

            if (count.get(num) > maxFrequency) {

                maxFrequency = count.get(num);
                mostFrequentNumber = num;
            }
        }

        System.out.println(mostFrequentNumber);

        return mostFrequentNumber;
    }

    public static void main(String[] args) {

        int[] nums = {4, 7, 4, 2, 7, 7, 9};

        mostFrequent(nums);
    }
}