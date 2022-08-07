package Algorithms;

import java.util.Arrays;

public class binarySearch {
    public boolean findElementIterative(int[] arr, int el) {
        int start = 0, end = arr.length;

        // System.out.println(arr);
        while (start <= end) {
            int mid = (start + end) / 2;
            // System.out.println(mid + "--" + arr[mid]);
            if (arr[mid] == el) {
                return true;
            }
            if (arr[mid] > el) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }

    public boolean findElementRecursive(int[] arr, int el, int start, int end) {
        int mid = (start + end) / 2;
        if (arr[mid] == el) {
            return true;
        }
        if (arr[mid] < el) {
            return findElementRecursive(arr, el, mid + 1, end);
        } else {
            return findElementRecursive(arr, el, start, mid - 1);
        }
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[] arr = { 2, 3, 44, 10, 40 };
        binarySearch b1 = new binarySearch();
        int find = 44;
        Arrays.sort(arr);
        // System.out.println(b1.findElementIterative(arr, find));
        System.out.println(b1.findElementRecursive(arr, find, 0, arr.length));

    }
}
