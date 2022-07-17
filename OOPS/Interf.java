package OOPS;

public class Interf {
    public static void main(String[] args) {
        Audi c1 = new Audi();
        // c1.start();
        // c1.walk();

        fi interObjs = x -> x * x;
        System.out.println(interObjs.calc(10));

    }
}

interface Car {
    void start();

}

@FunctionalInterface
interface fi {
    int calc(int x);
}

interface person {
    void walk();
}

class Audi implements Car, person {
    @Override
    public void start() {
        System.out.println("AUDI STARTED");
    }

    @Override
    public void walk() {
        System.out.println("AUDI Walking");

    }

}
