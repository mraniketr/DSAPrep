package StreamAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Lambda {

    public String getCarName() {
        return "BMW";
    }

    public static void main(String[] args) {
        Function<String, String> fn = x -> x + " From Lambda";
        System.out.println(fn.apply("ANIKET"));

        Square s = (x) -> x * x;

        System.out.println(s.calculate(20));
    }

}

@FunctionalInterface
interface Square {
    int calculate(int x);
}