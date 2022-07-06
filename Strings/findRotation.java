package Strings;

import java.util.Arrays;

public class findRotation {

    public static void main(String[] args) {
        char[] t1 = { 'A', 'B', 'C', 'A' };
        char[] t2 = { 'C', 'A', 'A', 'B' };

        int j = Arrays.binarySearch(t1, t2[0]);
        // System.out.println(j);
        boolean ans = true;
        for (int i = 0; i < t2.length; i++) {
            if (t2[i] != t1[j++]) {
                ans = false;
                break;
            }
            j = (j) > t1.length - 1 ? 0 : (j);
            // System.out.println(j);
        }
        System.out.println(ans);
    }
}
