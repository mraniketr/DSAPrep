package CollectionF.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListF {
    public static void main(String[] args) {
        List<Integer> l1 = new LinkedList<>();

        l1.add(1);
        l1.add(9);
        l1.add(3);
        System.out.println(l1.indexOf(3));
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println(l1);
        l1.get(1);
        l1.set(1, 3);
        System.out.println(l1);
        System.out.println(l1.indexOf(3));

    }

}
