package OOPS;

public class Interf {
    public static void main(String[] args) {
        Audi c1 = new Audi();
        c1.start();
    }
}

interface Car {
    void start();

}

class Audi implements Car {
    @Override
    public void start() {
        System.out.println("AUDI STARTED");
    }
}
