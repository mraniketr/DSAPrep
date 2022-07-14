package Arrays;

import java.util.Arrays;

public class duplicate {
    public static void main(String[] args) {
        // int[] arr = { 1, 3, 4, 2, 2 };
        int[] arr = { 3, 1, 3, 4, 2 };
        // Arrays.sort(arr);
        // int temp = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        // if (temp == arr[i]) {
        // break;
        // }
        // temp = arr[i];
        // }
        // System.out.println(temp);

        // Method 2
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == temp) {
                    break;
                }
            }
        }
        System.out.println(temp);
    }
}
