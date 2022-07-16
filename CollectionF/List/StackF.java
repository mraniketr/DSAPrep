package CollectionF.List;

import java.util.Stack;

public class StackF {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        System.out.println(s1);
        System.out.println(s1.peek());
        s1.pop();
        System.out.println(s1);
    }
}
