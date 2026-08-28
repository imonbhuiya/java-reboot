package org.example.dsa.HashMap.countNumber;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        int[] nums = {2, 5, 2, 8, 5};

        HashMap<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            if (count.containsKey(num)) {
                count.put(num, count.get(num) + 1);
            } else {
                count.put(num, 1);
            }

        }
        System.out.println(count);


    }
}
