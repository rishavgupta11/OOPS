package OOPS4;

public class LearnAbstract {

    public static void main(String[] args) {
//        Vehicle v1 = new Vehicle();
        Car c1 = new Car();
        c1.accelerate();
        c1.breaks(4);
        c1.honks();
    }
}

abstract class Vehicle {

    abstract void accelerate();
    abstract int breaks(int wheels);

    void honks() {
        System.out.println("Vehicle honks");
    }
}

class Scooter extends Vehicle {

    void accelerate() {

    }

    int breaks(int wheels) {
        return 0;
    }
}

class Car extends Vehicle {

    @Override
    void accelerate() {
        System.out.println("Car is Accelerating");
    }


    int breaks(int wheels) {
        System.out.println("Car breaks are pushed");
        return wheels;
    }

    void honks() {
        System.out.println("Car is honked");
    }
}


