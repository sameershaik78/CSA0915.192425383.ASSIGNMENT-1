
package Task10;

class Vehicle {
    // Private data members
    private String regNo;
    private String vehicleType;
    private Double parkingFee;

    // Constructor
    Vehicle(String regNo, String vehicleType) {
        setRegNo(regNo);
        setVehicleType(vehicleType);
        this.parkingFee = 0.0;
    }

    // Getter for registration number
    public String getRegNo() {
        return regNo;
    }

    // Setter with validation
    public void setRegNo(String regNo) {
        if (regNo != null && !regNo.trim().isEmpty()) {
            this.regNo = regNo;
        } else {
            System.out.println("Invalid registration number");
        }
    }

    // Getter for vehicle type
    public String getVehicleType() {
        return vehicleType;
    }

    // Setter with validation
    public void setVehicleType(String vehicleType) {
        if (vehicleType != null && !vehicleType.trim().isEmpty()) {
            this.vehicleType = vehicleType;
        } else {
            System.out.println("Invalid vehicle type");
        }
    }

    // Getter for parking fee
    public Double getParkingFee() {
        return parkingFee;
    }

    // Setter with validation
    public void setParkingFee(Double parkingFee) {
        if (parkingFee != null && parkingFee >= 0) {
            this.parkingFee = parkingFee;
        } else {
            System.out.println("Invalid parking fee");
        }
    }

    public void displayDetails() {
        System.out.println("Registration Number: " + getRegNo());
        System.out.println("Vehicle Type: " + getVehicleType());
        System.out.println("Parking Fee: Rs. " + getParkingFee());
    }
}

public class Task10 {
    public static void main(String[] args) {

        Vehicle v = new Vehicle("TN01AB1234", "Car");

        // Autoboxing: double converted to Double
        double fee = 50.0;
        v.setParkingFee(fee);

        System.out.println("Vehicle Details:");
        v.displayDetails();

        // Wrapper class example
        Integer hours = 3;
        Double rate = 20.0;

        // Unboxing: wrapper objects converted to primitives
        double totalFee = hours * rate;

        System.out.println("\nWrapper Class Example:");
        System.out.println("Parking Hours: " + hours);
        System.out.println("Rate per Hour: Rs. " + rate);
        System.out.println("Total Fee: Rs. " + totalFee);

        // Validation example
        System.out.println("\nTesting Invalid Fee:");
        v.setParkingFee(-100.0);
    }
}
