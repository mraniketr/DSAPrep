package Arrays;

import java.util.ArrayList;
import java.util.List;

public class mergeintervals56 {

    public void merge(int[][] intervals) {
        // Sort on basis of first element
        // check till start of next is less than end of current
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < intervals.length;) {
            int counter = 0;
            int current = i + counter;
            List<Integer> subres = new ArrayList<>();
            try {
                while (intervals[current + 1][0] < intervals[current][1]) {
                    counter++;
                    current += counter;
                }
            } catch (Exception e) {
                System.out.println("ERROR");
            }
            subres.add(intervals[i][0]);
            subres.add(intervals[current][1]);

            i = i + 1 + counter;

            res.add(subres);

        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        // int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 } };
        int[][] intervals = { { 1, 4 }, { 4, 5 } };
        mergeintervals56 m1 = new mergeintervals56();

        m1.merge(intervals);
    }

}
