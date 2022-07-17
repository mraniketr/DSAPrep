package OOPS;

public class CarT {
    public void drive() {
        System.out.println("Drivimg");
    }

}

class Car2 extends CarT {
    public static void drive() {
        System.out.println("Drivimg2 2");
    }
}