package Arrays;

import java.util.Arrays;

public class reverse {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start++, end--);
        }
        System.out.println(Arrays.toString(arr));
    }
}
