package Arrays;

public class nextGreatest {
    static void findNextNumber(int array[], int n) {
        // Practise Yourself : Write your code Here
        int pointer = n - 1;
        for (int i = n; i >= 0; i--) {
            if (array[i] > array[i - 1]) {
                pointer = i;
                break;
            }
        }

        findlowestMax(array, pointer);

    }

    public static int findlowestMax(int array[], int idx) {
        int pV = array[idx];
        int ans = array[idx];
        int ansI = idx;
        for (int i = idx + 1; i <= array.length; i++) {
            if (array[i] > pV) {

                if (array[i] < ans) {
                    ans = array[i];
                    ansI = i;
                }
                if (i == idx + 1) {
                    ans = array[i];
                    ansI = i;
                }
            }
        }
        if (ansI == idx) {
            return -1;
        }
        return ansI;
    }

    public static void main(String[] args) {
        int array[] = { 2, 1, 8, 7, 6, 5 };
        int n = array.length;
        findNextNumber(array, n);
    }
}
