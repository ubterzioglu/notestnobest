package Sample_Java_Object;

class Car {
    String color;          // data
    void drive() {         // action
        System.out.println("The car is driving");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();      // create object
        myCar.color = "Red";        // set data
        myCar.drive();              // call method
    }
}
