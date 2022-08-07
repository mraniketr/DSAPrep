package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class user {
    String name;
    int level;

    public user(String name, int level) {
        this.name = name;
        this.level = level;
    }

}

public class predicatesj8 {
    public static void main(String[] args) {

        user u1 = new user("aniket", 1);
        user u2 = new user("bhagyesh", 2);
        user u3 = new user("deepika", 3);

        List<user> users = new ArrayList<user>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        Predicate<user> p1 = (user u) -> u.level > 1;
        users.forEach((x) -> {
            if (p1.test(x)) {
                System.out.println("HIGH LEVEL USER " + x.name);
            }
        });

    }
}
