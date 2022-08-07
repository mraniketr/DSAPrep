package CollectionF.StackF;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        Map<Character, Character> parenthesisMap = new HashMap<>();
        parenthesisMap.put('{', '}');
        parenthesisMap.put('[', ']');
        parenthesisMap.put('(', ')');

        for (int i = 0; i < s.length(); i++) {
            Character item = s.charAt(i);
            // System.out.println(item);
            if (item == '{' || item == '[' || item == '(') {
                stk.push(item);
            } else {
                Character popI = stk.pop();
                try {
                    if (item != parenthesisMap.get(popI)) {
                        return false;
                    }
                } catch (Exception e) {
                    return false;
                }
            }

        }

        if (!stk.isEmpty()) {
            return false;
        }
        return true;
    }
}

public class parenthesis {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isValid("{]"));
    }

}
