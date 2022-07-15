package CollectionF;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Lambda {

    public String getCarName() {
        return "BMW";
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        // FILTER
        // Map<Integer, Integer> new1 = arr.stream().filter(x -> x % 2 !=
        // 0).collect(Collectors.toMap(x -> x, x -> x * x));
        // System.out.println(new1);

        // MAP
        // List<Integer> new1 = arr.stream().map(x -> x *
        // 3).collect(Collectors.toList());
        // System.out.println(new1);

        // Reduce
        Optional<Integer> new1 = arr.stream().reduce((x, y) -> x + y);
        System.out.println(new1.get());
    }

}