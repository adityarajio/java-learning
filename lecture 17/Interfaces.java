public class Interfaces {
    public static void main(String[] args) {
        Car c = new FuelCar();
        c.start();
        c.accelerate();
        c.brake();
    }
}

interface Car {
     void start();
    void accelerate();

    void brake();
}

class FuelCar implements Car {

    @Override
    public void start() {
        System.out.println("Fuel car is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Fuel car is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Fuel car is stopping");
    }
    
}

class ElectricCar implements Car {

    @Override
    public void start() {
        System.out.println("Electric car is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric car is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Electric car is stopping");
    }
    
}