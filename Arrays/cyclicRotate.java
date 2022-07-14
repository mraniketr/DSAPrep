package Arrays;

import java.util.stream.IntStream;
import java.util.Arrays;

public class cyclicRotate {
    public static void rotate(int arr[], int n) {
        int rotateBy = 3;
        int l = 0;
        int[] temp = new int[rotateBy];
        for (int i = n - rotateBy; i < n; i++) {
            temp[l++] = arr[i];
        }
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(temp));
        for (int i = n - rotateBy - 1; i >= 0; i--) {
            arr[i + rotateBy] = arr[i];

        }
        // System.out.println(Arrays.toString(arr));
        for (int i = 0; i < rotateBy; i++) {
            arr[i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4 };
        rotate(a, a.length);
    }
}
