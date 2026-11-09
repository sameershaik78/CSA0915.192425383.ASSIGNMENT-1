
class ParkingTicket {
    String regNo;
    String vehicleType;
    int floor;
    int slot;

    ParkingTicket(String regNo, String vehicleType,
                  int floor, int slot) {
        this.regNo = regNo;
        this.vehicleType = vehicleType;
        this.floor = floor;
        this.slot = slot;
    }
}

class ParkingFacility {

    // Three floors with different slot capacities
    boolean[][] slots = {
        new boolean[2],
        new boolean[1],
        new boolean[1]
    };

    // Active tickets stored in an array
    ParkingTicket[] tickets = new ParkingTicket[4];

    int getRate(String type) {
        switch (type.toUpperCase()) {
            case "TWO_WHEELER":
                return 10;
            case "CAR":
                return 30;
            case "ELECTRIC_CAR":
                return 40;
            default:
                return -1;
        }
    }

    int findTicket(String regNo) {
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] != null &&
                tickets[i].regNo.equalsIgnoreCase(regNo)) {
                return i;
            }
        }
        return -1;
    }

    String enterVehicle(String regNo, String type,
                        int floor, int slot) {

        if (getRate(type) == -1) {
            return "FAIL - Unknown vehicle type";
        }

        if (findTicket(regNo) != -1) {
            return "FAIL - Duplicate registration number";
        }

        if (floor < 1 || floor > slots.length) {
            return "FAIL - Invalid floor number";
        }

        if (slot < 1 || slot > slots[floor - 1].length) {
            return "FAIL - Invalid slot number";
        }

        if (slots[floor - 1][slot - 1]) {
            return "FAIL - Slot already occupied";
        }

        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] == null) {
                slots[floor - 1][slot - 1] = true;

                tickets[i] = new ParkingTicket(
                    regNo, type, floor, slot
                );

                return "SUCCESS - Vehicle parked at Floor "
                       + floor + ", Slot " + slot;
            }
        }

        return "FAIL - Parking facility is full";
    }

    String exitVehicle(String regNo, int minutes) {

        if (minutes < 0) {
            return "FAIL - Invalid parking duration";
        }

        int index = findTicket(regNo);

        if (index == -1) {
            return "FAIL - Ticket not found";
        }

        ParkingTicket ticket = tickets[index];

        int rate = getRate(ticket.vehicleType);

        // Charge for every started hour
        int hours = (minutes + 59) / 60;

        int fee = hours * rate;

        // Release the parking slot
        slots[ticket.floor - 1][ticket.slot - 1] = false;
        tickets[index] = null;

        return "SUCCESS - " + regNo + " | Duration: "
               + minutes + " minutes | Fee: Rs." + fee;
    }
}

public class SmartParkingSystem {

    static void showTest(String name, String actual,
                         String expected) {

        boolean passed = actual.equals(expected);

        System.out.println("\nTest: " + name);
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        System.out.println("Status: " + (passed ? "PASS" : "FAIL"));
    }

    public static void main(String[] args) {

        ParkingFacility parking = new ParkingFacility();

        System.out.println("SMART PARKING SYSTEM");
        System.out.println("====================");

        // Test 1: Normal vehicle entry and exit
        showTest("Car Entry",
            parking.enterVehicle("CAR101", "CAR", 1, 1),
            "SUCCESS - Vehicle parked at Floor 1, Slot 1");

        showTest("Two-Wheeler Entry",
            parking.enterVehicle("BIKE101", "TWO_WHEELER", 1, 2),
            "SUCCESS - Vehicle parked at Floor 1, Slot 2");

        showTest("Car Exit",
            parking.exitVehicle("CAR101", 60),
            "SUCCESS - CAR101 | Duration: 60 minutes | Fee: Rs.30");

        showTest("Two-Wheeler Exit",
            parking.exitVehicle("BIKE101", 30),
            "SUCCESS - BIKE101 | Duration: 30 minutes | Fee: Rs.10");

        // Test 2: Zero-minute parking
        showTest("Zero-Minute Parking",
            parking.enterVehicle("ZERO101", "CAR", 2, 1),
            "SUCCESS - Vehicle parked at Floor 2, Slot 1");

        showTest("Zero-Minute Exit",
            parking.exitVehicle("ZERO101", 0),
            "SUCCESS - ZERO101 | Duration: 0 minutes | Fee: Rs.0");

        // Test 3: Last available slot
        parking.enterVehicle("LAST1", "CAR", 1, 1);
        parking.enterVehicle("LAST2", "CAR", 1, 2);
        parking.enterVehicle("LAST3", "CAR", 2, 1);

        showTest("Last Free Slot",
            parking.enterVehicle("LAST4", "CAR", 3, 1),
            "SUCCESS - Vehicle parked at Floor 3, Slot 1");

        // Test 4: Unknown vehicle type
        showTest("Unknown Vehicle Type",
            parking.enterVehicle("UNKNOWN1", "BUS", 3, 1),
            "FAIL - Unknown vehicle type");

        // Test 5: Duplicate registration number
        showTest("Duplicate Registration",
            parking.enterVehicle("LAST4", "CAR", 3, 1),
            "FAIL - Duplicate registration number");

        // Test 6: Invalid slot number
        showTest("Invalid Slot Number",
            parking.enterVehicle("INVALID1", "CAR", 1, 5),
            "FAIL - Invalid slot number");

        // Test 7: Facility full
        showTest("Parking Facility Full",
            parking.enterVehicle("FULL1", "CAR", 1, 1),
            "FAIL - Parking facility is full");

        // Test 8: Electric car entry and exit
        parking.exitVehicle("LAST1", 60);
        parking.exitVehicle("LAST2", 60);
        parking.exitVehicle("LAST3", 60);

        showTest("Electric Car Entry",
            parking.enterVehicle("EV101", "ELECTRIC_CAR", 1, 1),
            "SUCCESS - Vehicle parked at Floor 1, Slot 1");

        showTest("Electric Car Exit",
            parking.exitVehicle("EV101", 120),
            "SUCCESS - EV101 | Duration: 120 minutes | Fee: Rs.80");

        System.out.println("\nALL TESTS COMPLETED");
    }
}
