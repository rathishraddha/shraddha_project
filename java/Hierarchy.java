// Hierarchy Example
class Vehicle {
    public void start() {
        System.out.println("Vehicle starts.");
    }
}

class Car extends Vehicle {
    public void honk() {
        System.out.println("Car honks.");
    }
}

class ElectricCar extends Car {
    public void charge() {
        System.out.println("Electric car is charging.");
    }
}

public class Hierarchy {
    public static void main(String[] args) {
        ElectricCar eCar = new ElectricCar();
        eCar.start();   // From Vehicle
        eCar.honk();    // From Car
        eCar.charge();  // Specific to ElectricCar
    }
}
