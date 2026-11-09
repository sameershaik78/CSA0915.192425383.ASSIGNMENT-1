
import java.time.LocalTime;

abstract class Vehicle {
    protected String regNo;

    Vehicle(String regNo) {
        this.regNo = regNo;
    }

    public String getRegNo() {
        return regNo;
    }

    public abstract String getType();
}

class Car extends Vehicle {
    Car(String regNo) {
        super(regNo);
    }

    public String getType() {
        return "CAR";
    }
}

class ElectricCar extends Vehicle {
    ElectricCar(String regNo) {
        super(regNo);
    }

    public String getType() {
        return "ELECTRIC_CAR";
    }
}

class TwoWheeler extends Vehicle {
    TwoWheeler(String regNo) {
        super(regNo);
    }

    public String getType() {
        return "TWO_WHEELER";
    }
}

class EBike extends Vehicle {
    EBike(String regNo) {
        super(regNo);
    }

    public String getType() {
        return "E_BIKE";
    }
}

class DeliveryVan extends Vehicle {
    DeliveryVan(String regNo) {
        super(regNo);
    }

    public String getType() {
        return "DELIVERY_VAN";
    }
}

class ParkingFeeCalculator {
    static int calculateFee(Vehicle vehicle, int minutes,
                            LocalTime entryTime, boolean visitorPass) {

        if (visitorPass) {
            return 100;
        }

        if (vehicle instanceof EBike) {
            return 20;
        }

        int hours = (minutes + 59) / 60;
        int rate = 0;

        if (vehicle instanceof TwoWheeler) {
            rate = 10;
        } else if (vehicle instanceof ElectricCar) {
            rate = 40;
        } else if (vehicle instanceof Car) {
            rate = 30;
        } else if (vehicle instanceof DeliveryVan) {
            rate = 30;

            if (!entryTime.isBefore(LocalTime.of(9, 0))
                    && entryTime.isBefore(LocalTime.of(17, 0))) {
                rate = 60;
            }
        }

        return hours * rate;
    }
}

class ParkingFacility {

    boolean[][] slots = {
        new boolean[2],
        new boolean[3],
        new boolean[1],
        new boolean[4],
        new boolean[2]
    };

    boolean parkVehicle(Vehicle vehicle, int floor, int slot) {

        if (floor < 1 || floor > slots.length) {
            System.out.println("Invalid floor number");
            return false;
        }

        if (slot < 1 || slot > slots[floor - 1].length) {
            System.out.println("Invalid slot number");
            return false;
        }

        if (slots[floor - 1][slot - 1]) {
            System.out.println("Slot already occupied");
            return false;
        }

        slots[floor - 1][slot - 1] = true;

        System.out.println(vehicle.getType() + " "
                + vehicle.getRegNo()
                + " parked at Floor " + floor
                + ", Slot " + slot);

        return true;
    }

    void releaseSlot(int floor, int slot) {

        if (floor >= 1 && floor <= slots.length
                && slot >= 1
                && slot <= slots[floor - 1].length) {

            slots[floor - 1][slot - 1] = false;
        }
    }

    void displayFloorCapacity() {

        System.out.println("\nFIVE-FLOOR PARKING CAPACITY");

        for (int i = 0; i < slots.length; i++) {
            System.out.println("Floor " + (i + 1)
                    + ": " + slots[i].length + " slots");
        }
    }
}

public class Task12_DesignChallenge {

    static void test(String name, int actual, int expected) {

        System.out.println(name);
        System.out.println("Expected Fee: Rs." + expected);
        System.out.println("Actual Fee: Rs." + actual);

        System.out.println(actual == expected ? "PASS\n" : "FAIL\n");
    }

    public static void main(String[] args) {

        ParkingFacility facility = new ParkingFacility();

        facility.displayFloorCapacity();

        System.out.println("\nNEW VEHICLE TESTS");

        EBike ebike = new EBike("EB101");
        DeliveryVan van = new DeliveryVan("DV101");
        Car car = new Car("CAR101");

        facility.parkVehicle(ebike, 1, 1);
        facility.parkVehicle(van, 2, 1);
        facility.parkVehicle(car, 5, 1);

        int ebikeFee = ParkingFeeCalculator.calculateFee(
                ebike, 120, LocalTime.of(10, 0), false);

        int vanDayFee = ParkingFeeCalculator.calculateFee(
                van, 120, LocalTime.of(10, 0), false);

        int vanNightFee = ParkingFeeCalculator.calculateFee(
                van, 120, LocalTime.of(18, 0), false);

        int visitorFee = ParkingFeeCalculator.calculateFee(
                car, 300, LocalTime.of(11, 0), true);

        test("E-Bike Flat Fee", ebikeFee, 20);

        test("Delivery Van During 9 AM-5 PM",
                vanDayFee, 120);

        test("Delivery Van After 5 PM",
                vanNightFee, 60);

        test("Visitor One-Day Pass",
                visitorFee, 100);

        facility.releaseSlot(1, 1);
        facility.releaseSlot(2, 1);
        facility.releaseSlot(5, 1);

        System.out.println("All Task 12 tests completed.");
    }
}
