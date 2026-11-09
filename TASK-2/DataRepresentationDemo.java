
import java.util.Scanner;
import java.time.LocalDateTime;

public class DataRepresentationDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int slotNumber;
        String vehicleNumber;
        LocalDateTime entryTime;
        int durationMinutes;
        double fee;

        System.out.print("Enter slot number: ");
        slotNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter vehicle number: ");
        vehicleNumber = sc.nextLine();

        System.out.print("Enter parking duration in minutes: ");
        durationMinutes = sc.nextInt();

        entryTime = LocalDateTime.now();

        double ratePerHour = 30.0;

        // Incorrect calculation using integer division
        int wrongHours = durationMinutes / 60;

        // Correct calculation: charge every started hour
        int billableHours = (durationMinutes + 59) / 60;

        fee = billableHours * ratePerHour;

        System.out.println("\n--- Parking Details ---");
        System.out.println("Slot Number: " + slotNumber);
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Entry Time: " + entryTime);
        System.out.println("Duration: " + durationMinutes + " minutes");
        System.out.println("Wrong Billable Hours: " + wrongHours);
        System.out.println("Correct Billable Hours: " + billableHours);
        System.out.println("Parking Fee: Rs. " + fee);

        sc.close();
    }
}
