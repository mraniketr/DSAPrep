package leetcode;

class Solution {
    public int pivotIndex(int[] nums) {

        int pivot = 0;
        int LS = 0;

        int rPointer = nums.length - 1;
        int RS = nums[rPointer];

        while (pivot != rPointer - 1) {
            if (LS <= RS) {
                LS += nums[pivot++];
            } else {
                RS += nums[--rPointer];
            }
        }

        if (LS == RS) {
            return pivot;
        } else {
            return -1;
        }

    }
}

public class l724 {
    public static void main(String[] args) {
        Solution sol1 = new Solution();
        int[] nums = { 1, 2, 3 };
        sol1.pivotIndex(nums);
    }
}
