package OOPS;

abstract class Car {
    String brand;
    int price;

    abstract void start();
}

class Audi extends Car {

    @Override
    void start() {
        System.out.println("AUDI STARTED");

    }

}

class BMW extends Car {

    @Override
    void start() {
        System.out.println("BMW STARTED");

    }
}

public class AbstractionsF {
    public static void main(String[] args) {
        Car c1 = new BMW();
        c1.start();
    }
}