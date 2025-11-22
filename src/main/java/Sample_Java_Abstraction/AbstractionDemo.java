package Sample_Java_Abstraction;

abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starting");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starting");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v2.start();
    }
}

