package StacksnQueues;

import java.util.ArrayList;
import java.util.Stack;

public class rpn {

}

class Solution {
    public int string2Int(String s) {
        return Integer.parseInt(s);
    }

    public int evalRPN(ArrayList<String> A) {
        Stack<Integer> s1 = new Stack<>();
        for (int i = 0; i < A.size(); i++) {
            String curr = A.get(i);
            try {
                s1.push(string2Int(curr));
            } catch (Exception e) {
                int el1 = s1.pop();
                int el2 = s1.pop();
                int res = 0;

                switch (curr) {
                    case "+":
                        res = el2 + el1;
                        break;
                    case "-":
                        res = el2 - el1;
                        break;
                    case "*":
                        res = el2 * el1;
                        break;
                    case "/":
                        res = el2 / el1;
                        break;
                }
                s1.push(res);

            }
        }
        return s1.pop();
    }
}
