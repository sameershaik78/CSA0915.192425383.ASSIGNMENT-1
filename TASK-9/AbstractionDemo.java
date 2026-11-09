abstract class Vehicle {
    private String regNo;

    Vehicle(String regNo) {
        this.regNo = regNo;
    }

    public String getRegNo() {
        return regNo;
    }

    abstract double calculateParkingFee(int hours);

    public void display() {
        System.out.println("Vehicle Number: " + regNo);
    }
}

interface Chargeable {
    double chargingFee(int units);

    default void chargingInfo() {
        System.out.println("Charging is available");
    }

    static double getRatePerUnit() {
        return 9.0;
    }
}

interface Payable {
    void pay(double amount);

    default void paymentMode() {
        System.out.println("Payment mode: Online");
    }
}

class Car extends Vehicle implements Payable {

    Car(String regNo) {
        super(regNo);
    }

    @Override
    double calculateParkingFee(int hours) {
        return hours * 30.0;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Car payment: Rs " + amount);
    }
}

class ElectricCar extends Vehicle
        implements Chargeable, Payable {

    ElectricCar(String regNo) {
        super(regNo);
    }

    @Override
    double calculateParkingFee(int hours) {
        return hours * 40.0;
    }

    @Override
    public double chargingFee(int units) {
        return units * Chargeable.getRatePerUnit();
    }

    @Override
    public void pay(double amount) {
        System.out.println("Electric Car payment: Rs " + amount);
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {

        Car car = new Car("TN02B2");

        ElectricCar ev = new ElectricCar("TN03C3");

        System.out.println("CAR DETAILS");
        car.display();
        System.out.println(
            "Parking Fee: Rs " + car.calculateParkingFee(2)
        );
        car.paymentMode();
        car.pay(car.calculateParkingFee(2));

        System.out.println("\nELECTRIC CAR DETAILS");
        ev.display();
        ev.chargingInfo();

        double parkingFee = ev.calculateParkingFee(2);
        double chargingFee = ev.chargingFee(10);

        System.out.println("Parking Fee: Rs " + parkingFee);
        System.out.println("Charging Fee: Rs " + chargingFee);

        ev.paymentMode();
        ev.pay(parkingFee + chargingFee);
    }
}