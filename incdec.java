
class findNum {
    static int findNumber(int array[], int start, int end, int value) {
        // Write your code here
        // Result Index 7
        int mid = (start + end) / 2;
        System.out.println(start + "," + end + "," + mid);
        if (array[mid] == value)
            return mid;
        if (array[mid] >= start) {
            if (value >= array[start] && value <= array[mid]) {
                return findNumber(array, start, mid - 1, value);
            }
            return findNumber(array, mid + 1, end, value);
        }
        if (value >= array[start] && value <= array[mid]) {
            return findNumber(array, start, mid - 1, value);
        }
        return findNumber(array, mid + 1, end, value);
    }

    public static void main(String args[]) {
        int array[] = { 3, 4, 5, 6, 7, 8, 9, 1, 2 };
        int n = array.length;
        int value = 1;
        int i = findNumber(array, 0, n - 1, value);
        if (i != -1)
            System.out.println("Index: " + i);
        else
            System.out.println("Value not found");
    }
}
