public class Abstraction {
    public static void main(String[] args) {
        // Car c = new ElectricCar();/
        Car c = new FuelCar();
        c.start();
        c.accelerate();
        c.brake();
    }
}

abstract class Car {
    void start() {
        System.out.println("Car has started");
    }

    abstract void accelerate();

    abstract void brake();
}

class FuelCar extends Car {
    @Override
    void accelerate() {
        System.out.println("Fuel car is accelerating");
    }

    @Override
    void brake() {
        System.out.println("Fuel car is stopping");
    }
}

class ElectricCar extends Car {
    @Override
    void accelerate() {
        System.out.println("Electric car is accelerating");
    }

    @Override
    void brake() {
        System.out.println("Electric car is stopping");
    }
}