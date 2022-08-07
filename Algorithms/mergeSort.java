package Algorithms;

import java.util.Arrays;

public class mergeSort {

    public static void divide(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            divide(arr, start, mid);
            divide(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int tempLen = end - start;
        int[] tempArr = new int[tempLen + 1];

        int tempIdx = 0;
        int i = start;
        int j = mid + 1;
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                tempArr[tempIdx] = arr[i];
                i++;
                tempIdx++;
            } else {
                tempArr[tempIdx] = arr[j];
                j++;
                tempIdx++;
            }
        }

        if (i <= mid) {
            while (i <= mid) {
                tempArr[tempIdx++] = arr[i++];
            }
        } else {
            while (j <= end) {
                tempArr[tempIdx++] = arr[j++];
            }
        }
        int tmpSwap = 0;
        for (int k = start; k <= end; k++) {
            arr[k] = tempArr[tmpSwap++];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 9, 6, 7, 2 };
        divide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
