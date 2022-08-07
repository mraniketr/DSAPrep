package leetcode;

import java.util.Arrays;

class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}

public class l1480 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 1, 1, 1, 1 };
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(sol.runningSum(nums)));

    }
}
