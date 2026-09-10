package org.example.dsa.TwoPointers.Exercise;

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();

        String s = "tab a cat";

        boolean result = solution.isPalindrome(s);

        System.out.println(result);
    }

    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;

            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;

            } else {
                char leftChar = Character.toLowerCase(s.charAt(left));
                char rightChar = Character.toLowerCase(s.charAt(right));

                if (leftChar == rightChar) {
                    left++;
                    right--;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}