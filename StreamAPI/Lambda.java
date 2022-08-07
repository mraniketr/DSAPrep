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

    public static void main(String[] args) {
        Function<String, String> fn = x -> x + " From Lambda";
        System.out.println(fn.apply("ANIKET"));

        Square s = (x) -> x * x;

        System.out.println(s.calculate(20));

        SquareArea sa = (x, y) -> x * y;
        System.out.println(sa.calculate(4, 5));

    }

}

@FunctionalInterface
interface Square {
    int calculate(int x);
}

@FunctionalInterface
interface SquareArea {
    int calculate(int x, int y);
}