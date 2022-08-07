package CollectionF.Q;

class Solution {
    public int firstUniqChar(String s) {
        int sol = -1;
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            boolean dup = false;
            for (int j = 0; j < s.length(); j++) {
                if (j != i) {
                    if (curr == s.charAt(j)) {
                        dup = true;
                        break;
                    }
                }
            }

            if (!dup) {
                sol = i;
                break;
            }
        }
        return sol;
    }
}

public class leet387 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.firstUniqChar("aabb"));
    }
}
