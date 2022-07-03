package Arrays;

import java.util.Arrays;

class maxJumps {
    private static int Jump(int[] num) {
        // Practise Yourself : Write your code Here
        //
        int count = 0;
        int current = 0;
        while (current + 1 < num.length) {
            // System.out.println(current + " " + count);
            current = findMax(num, current);
            count++;
            if (current == -1) {
                return -1;
            }
        }
        return count;
    }

    public static int findMax(int[] num, int idx) {
        int val = num[idx];
        if (idx + val >= num.length) {
            return num.length;
        }

        int end = idx + val;
        int MaxVal = num[idx + 1];
        int maxIdx = idx + 1;
        for (int i = idx + 1; i <= end; i++) {
            if (num[i] > MaxVal) {
                MaxVal = num[i];
                maxIdx = i;
            }
        }
        // System.out.println("JUMPTO -" + maxIdx);
        if (MaxVal == 0) {
            return -1;
        }
        return maxIdx;
    }

    public static void main(String[] args) {
        // int num[] = { 2, 3, 1, 1, 4 };
        int num[] = { 3, 2, 1, 0, 4 };
        // int num[] = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        // int num[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        // max(3,1) -> 3

        /*
         * 3,3,9,4,2,8,2,2
         * 2 -> max(3,4)->4
         * 4-> max()
         */
        System.out.println(Arrays.toString(num));
        System.out.println("Minimum number of jumps to reach end is : "
                + Jump(num));
    }
}
