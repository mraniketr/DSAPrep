package Arrays;

import java.util.Arrays;

public class duplicate {
    public static int findDuplicate(int[] nums) {
        int temp = nums[0];
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];
            // System.out.println(temp);
            for (int j = 0; j < nums.length; j++) {
                if (j != i && nums[j] == temp) {
                    return temp;
                }
            }
        }
        return temp;

    }

    public static int findDup1(int[] arr) {
        Arrays.sort(arr);
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (temp == arr[i]) {
                break;
            }
            temp = arr[i];
        }
        return temp;
    }

    public static int findDup2(int[] arr) {
        return 0;
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 3, 4, 2, 2 };
        int[] arr = { 3, 1, 3, 4, 2 };

        // System.out.println(findDuplicate(arr));
        // System.out.println(findDup1(arr));
        System.out.println(findDup2(arr));
    }
}
