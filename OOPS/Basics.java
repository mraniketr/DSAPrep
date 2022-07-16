package OOPS;

import OOPS.ecap.encap;

public class Basics {
    public static void main(String[] args) {
        Person p1 = new Person("Aniket", 22);
        Person p2 = new Person("Raj", 22);
        System.out.println(Person.count);

        p1.eat("Samosa");

        Dev d1 = new Dev("Rahul", 21);
        d1.eat("Pizza");

        encap e1 = new encap();
        e1.encWork();
    }
}

class Person {
    String name;
    protected int age;
    static int count;

    public Person() {
        System.out.println("DEFAULT CONSTRUCTOR RAN" + ++count);
    }

    public Person(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    void eat() {
        System.out.println(name + " IS EATING");
    }

    void eat(String food) {
        System.out.println(name + " IS EATING " + food);
    }
}

class Dev extends Person {
    public Dev(String name, int age) {
        super(name, age);
    }

    void eat(String food) {
        System.out.println("DEV " + name + " IS EATING " + food);
    }
}