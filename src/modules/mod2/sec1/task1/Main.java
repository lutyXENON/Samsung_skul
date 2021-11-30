package modules.mod2.sec1.task1;


class Automobile {
    final String mark;
    final String model;
    final int yearOfIssue;
    final int enginePower; // мощность двигателя
    final int mass;
    final int volumeOfTank;

    public Automobile(String mark, String model, int yearOfIssue, int enginePower, int mass, int volumeOfTank) {
        this.mark = mark;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.enginePower = enginePower;
        this.mass = mass;
        this.volumeOfTank = volumeOfTank;
    }

    int mileage; // пробег

    boolean isStarted;
    float fuelQuantity = 1; // отношение объёма оставшего топлива к объёму бака


    public void startEngine() {
        if (fuelQuantity <= 0.01) {
            System.out.println("No enough fuel to start! Please refuel.");
            return;
        }
        fuelQuantity -= 0.01;
        isStarted = true;
        System.out.println("Engine started!");
    }

    public void endEngine() {
        isStarted = false;
        System.out.println("Engine ended");
    }

    public void refuel() {
        fuelQuantity = 1;
        System.out.println("Refueled!");
    }

    public void ride(double distance) {
        if ((fuelQuantity - distance / 100) <= 0) {
            System.out.println("Please refuel automobile!");
            return;
        }
        fuelQuantity -= distance / 100;
        mileage += distance;
        System.out.println("You rode!");
    }

    protected boolean checkIfEngineEnded() {
        if (isStarted) return false;
        else {
            System.out.println("Start automobile before riding!");
            return true;
        }
    }
}

class Car extends Automobile {
    enum Carcase {
        COUPE, UNIVERSAL, SEDAN, JEEP, HATCHBACK, CABRIOLET
    }

    final Carcase carcase;

    public Car(String mark, String model, int yearOfIssue, int enginePower, int mass, int volumeOfTank, Carcase carcase) {
        super(mark, model, yearOfIssue, enginePower, mass, volumeOfTank);
        this.carcase = carcase;
    }

    public void drift(){
        if (checkIfEngineEnded()) return;
        if (fuelQuantity < 0.05){
            System.out.println("Please refuel car to drift!");
            return;
        }
        fuelQuantity -= 0.05;
        mileage += 2;
        System.out.println("Drift completed! Respect+");
    }

}

class Truck extends Automobile {
    int capacity; // вместимость грузового пространства

    int amountOfTrips;

    public Truck(String mark, String model, int yearOfIssue, int enginePower, int mass, int volumeOfTank, int capacity) {
        super(mark, model, yearOfIssue, enginePower, mass, volumeOfTank);
        this.capacity = capacity;
    }

    public void ride(double distance) {
        super.ride(distance * 0.8);
    }

    public void takeTrip() {
        if (checkIfEngineEnded()) return;

        if (fuelQuantity < 0.5) {
            System.out.println("Please refuel truck!");
            return;
        }
        fuelQuantity -= 0.5;
        mileage += 50;
        System.out.println("Trip done!");
        amountOfTrips++;
    }

}

class Bus extends Automobile {
    final int numOfSeats;

    int amountOfTrips;

    public Bus(String mark, String model, int yearOfIssue, int enginePower, int mass, int volumeOfTank, int numOfSeats) {
        super(mark, model, yearOfIssue, enginePower, mass, volumeOfTank);
        this.numOfSeats = numOfSeats;
    }

    public void ride(double distance) {
        super.ride(distance * 0.9);
    }

    public void takeTrip() {
        if (checkIfEngineEnded()) return;
        if (fuelQuantity < 0.1) {
            System.out.println("Please refuel bus!");
            return;
        }
        fuelQuantity -= 0.1;
        mileage += 10;
        System.out.println("Trip done!");
        amountOfTrips++;
    }
}

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck(
                "BMW",
                "Actros L",
                2008,
                2000,
                5000,
                200,
                10000
        );
        truck.startEngine();
        truck.fuelQuantity = 0;
        truck.takeTrip();
    }
}
