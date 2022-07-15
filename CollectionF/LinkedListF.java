package CollectionF;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListF {
    public static void main(String[] args) {
        // Queue
        Queue<Integer> q1 = new LinkedList<>();
        q1.offer(3);
        q1.offer(2);
        q1.offer(1);

        System.out.println(q1);
        System.out.println(q1.poll());
        System.out.println(q1);
        System.out.println(q1.peek());
        System.out.println(q1.poll());
        System.out.println(q1.poll());
        System.out.println(q1.poll());

        // LIST

        // List<Integer> l1 = new LinkedList<>();

        // l1.add(1);
        // l1.add(2);
        // l1.add(3);
        // System.out.println(l1);
        // l1.set(1, 3);
        // System.out.println(l1);
        // System.out.println(l1.indexOf(3));
    }
}
