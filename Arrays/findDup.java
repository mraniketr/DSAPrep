package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class findDup {
    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> s = new HashSet<>();
        for (int x : nums) {
            if (s.contains(x)) {
                return true;
            } else {
                s.add(x);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 1 };
        System.out.println(containsDuplicate(arr));
    }
}
