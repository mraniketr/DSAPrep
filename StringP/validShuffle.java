package StringP;

import java.util.HashMap;

public class validShuffle {
    public static void main(String[] args) {
        /*
         * XYX
         * 12
         * 
         * + XYX12,X12YX ...
         * - X12Y
         * #1
         * lenOG!=len2 reutrn false
         * hash OG
         * hash 2
         * compare both
         * 
         * #2
         * lenOG!=len2 reutrn false
         * add both
         * 
         */
        String s1 = "XYZ";
        String s2 = "12Z";
        String a = "X12YZZ";
        String q = s1 + s2;
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        boolean ans = true;
        if (q.length() != a.length()) {
            ans = false;
        } else {
            for (int i = 0; i < q.length(); i++) {
                char currQ = q.charAt(i);
                if (hm1.containsKey(currQ)) {
                    hm1.put(currQ, hm1.get(currQ) + 1);
                } else {
                    hm1.put(currQ, 1);
                }
            }
            for (int i = 0; i < q.length(); i++) {
                char currQ = a.charAt(i);
                if (hm1.containsKey(currQ)) {
                    hm1.put(currQ, hm1.get(currQ) - 1);
                    if (hm1.get(currQ) == 0) {
                        hm1.remove(currQ);
                    }
                } else {
                    ans = false;
                    break;
                }
            }

        }
        System.out.println(ans);

    }
}
