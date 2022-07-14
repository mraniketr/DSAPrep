package Arrays;

import java.util.HashSet;

public class unionArr {
    public static int doUnion(int a[], int n, int b[], int m) {
        // Your code here

        HashSet<Integer> un = new HashSet<>();
        for (int i = 0; i < n; i++) {
            un.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            un.add(b[i]);
        }

        return un.size();
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 5, 6, 7 };
        int n = a.length;
        int b[] = { 1, 9 };
        int m = b.length;

        System.out.println(doUnion(a, n, b, m));
    }
}
