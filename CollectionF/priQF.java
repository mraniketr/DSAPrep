package CollectionF;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priQF {
    public static void main(String[] args) {
        // Min Heap By Default
        // Queue<Integer> pq1 = new PriorityQueue<>();

        // Max Heap - largest max priority now
        Queue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());

        pq1.offer(9);
        pq1.offer(13);
        pq1.offer(2);
        pq1.offer(8);
        System.out.println(pq1);
        System.out.println(pq1.poll());
        System.out.println(pq1);
        System.out.println(pq1.poll());
        System.out.println(pq1.peek());
    }
}
