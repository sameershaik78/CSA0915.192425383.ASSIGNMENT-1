
class Vehicle {

    protected String regNo;

    // Parent constructor
    Vehicle(String regNo) {
        this.regNo = regNo;
        System.out.println("Vehicle constructor called");
    }

    public void display() {
        System.out.println("Registration Number: " + regNo);
    }

    protected double ratePerHour() {
        return 0.0;
    }
}

// Child class 1
class TwoWheeler extends Vehicle {

    TwoWheeler(String regNo) {
        super(regNo);
        System.out.println("TwoWheeler constructor called");
    }

    @Override
    protected double ratePerHour() {
        return 10.0;
    }
}

// Child class 2
class Car extends Vehicle {

    Car(String regNo) {
        super(regNo);
        System.out.println("Car constructor called");
    }

    @Override
    protected double ratePerHour() {
        return 30.0;
    }
}

// ElectricCar inherits from Car
class ElectricCar extends Car {

    ElectricCar(String regNo) {
        super(regNo);
        System.out.println("ElectricCar constructor called");
    }

    @Override
    protected double ratePerHour() {
        return 40.0;
    }

    public void displayElectricDetails() {
        super.display();
        System.out.println("Vehicle Type: Electric Car");
        System.out.println("Charging Supported: Yes");
    }
}

// Main class
public class InheritanceDemo {

    public static void main(String[] args) {

        System.out.println("Creating TwoWheeler:");
        TwoWheeler bike = new TwoWheeler("TN01A1");
        bike.display();

        System.out.println("\nCreating Car:");
        Car car = new Car("TN02B2");
        car.display();

        System.out.println("\nCreating ElectricCar:");
        ElectricCar electricCar =
            new ElectricCar("TN03C3");

        electricCar.displayElectricDetails();

        System.out.println("Parking Rate: Rs. " +
            electricCar.ratePerHour() + " per hour");
    }
}
