package CollectionF.List;

import java.util.ArrayList;
import java.util.List;

public class basics {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            l1.add(i);
        }
        l1.forEach(System.out::println);
        l1.forEach(x -> System.out.println(x));
    }
}
