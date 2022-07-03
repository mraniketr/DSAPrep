import java.util.Arrays;

class zeroright {
    static void MoveZeroToEnd(int array[], int n) {
        // Try yourself
        // Write your Code Here
        boolean findNZ = array[0] == 0 ? true : false;
        int pointer = 0;
        for (int i = 0; i < n; i++) {
            if (!findNZ) {
                if (array[i] == 0) {
                    findNZ = true;
                } else {
                    pointer++;
                }

            } else {
                if (array[i] != 0) {
                    findNZ = false;
                    swap(array, i, pointer);
                    pointer++;
                    i--;
                }
            }
            System.out.println(i + " " + Arrays.toString(array));

        }
    }

    public static int[] swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    public static void main(String[] args) {
        int array[] = { 0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
        int n = array.length;
        MoveZeroToEnd(array, n);
        System.out.println("result is: ");
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
    }
}
