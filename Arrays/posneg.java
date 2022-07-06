package Arrays;

public class posneg {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -1, -2 };
        int fpos = -1;
        int fneg = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                fpos = i;
            }

        }
    }
}
