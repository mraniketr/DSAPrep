package CollectionF.Q;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDeq {
    public static void main(String[] args) {

        ArrayDeque<Integer> deq1 = new ArrayDeque<>();
        deq1.offer(1);
        deq1.offerFirst(12);
        System.out.println(deq1);
        deq1.offerLast(13);
        System.out.println(deq1);
        System.out.println(deq1.peekFirst());
        System.out.println(deq1.peekLast());
    }
}
