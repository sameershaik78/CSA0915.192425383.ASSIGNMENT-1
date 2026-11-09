
import java.util.Objects;

abstract class Vehicle {

    // final prevents registration number reassignment
    private final String regNo;

    Vehicle(String regNo) {
        this.regNo = regNo;
    }

    public final String getRegNo() {
        return regNo;
    }

    // Subclasses must provide their own hourly rate
    protected abstract double ratePerHour();

    public double calculateFee(int minutes) {

        if (minutes < 0) {
            throw new IllegalArgumentException("Negative duration");
        }

        long hours = (minutes + 59L) / 60L;
        return hours * ratePerHour();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + regNo + "]";
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Vehicle)) {
            return false;
        }

        Vehicle other = (Vehicle) obj;

        return regNo.equals(other.regNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNo);
    }
}

class TwoWheeler extends Vehicle {

    TwoWheeler(String regNo) {
        super(regNo);
    }

    @Override
    protected double ratePerHour() {
        return 10.0;
    }
}

class Car extends Vehicle {

    Car(String regNo) {
        super(regNo);
    }

    @Override
    protected double ratePerHour() {
        return 30.0;
    }
}

class ElectricCar extends Vehicle {

    ElectricCar(String regNo) {
        super(regNo);
    }

    @Override
    protected double ratePerHour() {
        return 40.0;
    }
}

public class VehicleOverrideDemo {

    public static void main(String[] args) {

        Vehicle bike = new TwoWheeler("TN01A1");
        Vehicle car = new Car("TN02B2");
        Vehicle electricCar = new ElectricCar("TN03C3");

        System.out.println("Vehicle Details:");
        System.out.println(bike);
        System.out.println(car);
        System.out.println(electricCar);

        System.out.println("\nParking Fees:");
        System.out.println("Bike Fee: Rs. " +
                bike.calculateFee(130));

        System.out.println("Car Fee: Rs. " +
                car.calculateFee(130));

        System.out.println("Electric Car Fee: Rs. " +
                electricCar.calculateFee(130));

        System.out.println("\nEquality Check:");

        Vehicle car1 = new Car("TN02B2");
        Vehicle car2 = new ElectricCar("TN02B2");

        System.out.println("Are both vehicles equal? " +
                car1.equals(car2));

        System.out.println("Same hash code? " +
                (car1.hashCode() == car2.hashCode()));
    }
}
