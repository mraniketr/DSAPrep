package Arrays;

import java.util.Arrays;

class sort {
    // sort a array containing 0, 1 and 2
    // three-way Partitioning
    public static void Sort012(int[] array, int end) {
        // Practise Yourself : Write your code Here
        int low = 0;
        int high = end;
        for (int i = 0; i < end; i++) {
            if (i > high) {
                break;
            }
            int curr = array[i];
            if (curr == 2) {
                // System.out.println("CASE 2" + Arrays.toString(array));
                swap(array, i, high);
                high--;
                // System.out.println("CASE 2 SWAP" + Arrays.toString(array));
                if (array[i] == 0 || array[i] == 2) {
                    i--;
                }

            } else if (curr == 0) {
                swap(array, i, low);
                low++;
            }
            System.out.println(i + " " + high + " " + Arrays.toString(array));
        }
    }

    public static int[] swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] array = { 2, 0, 1, 1, 2, 2, 0, 1, 2, 0, 1 };
        // System.out.println(Arrays.toString(array));
        Sort012(array, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}

/*
 * Try more Inputs
 * case 1:
 * actual = Sort012([0, 1, 2, 0, 1, 2],5)
 * expected = [0, 0, 1, 1, 2, 2]
 * 
 * case2:
 * actual = Sort012([0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1],11)
 * expected = [0,0,0,0,0,1,1,1,1,1,2,2]
 * 
 * case3:
 * actual = Sort012([2,0,1}],3)
 * expected = [0,1,2]
 */