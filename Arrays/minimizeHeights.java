package Arrays;

import java.util.Arrays;

public class minimizeHeights {
    static int getMinDiff(int[] arr, int n, int k) {
        // code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < k) {
                arr[i] = arr[i] + k;
            } else {
                arr[i] = arr[i] - k;
            }

        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        return max - min;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 3, 4, 7, 2, 10, 3, 2, 1 };
        System.out.println(getMinDiff(arr, arr.length, 5));
    }
}
