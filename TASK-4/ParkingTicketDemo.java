
import java.time.LocalDateTime;

class ParkingTicket {

    private String ticketNumber;
    private String vehicleNumber;
    private LocalDateTime entryTime;

    // Default constructor
    public ParkingTicket() {
        this("TICKET001", "UNKNOWN");
    }

    // Parameterized constructor
    public ParkingTicket(String ticketNumber, String vehicleNumber) {
        this.ticketNumber = ticketNumber;
        this.vehicleNumber = vehicleNumber;
        this.entryTime = LocalDateTime.now();
    }

    // Display ticket details
    public void displayTicket() {
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Entry Time: " + entryTime);
        System.out.println("--------------------------");
    }
}

public class ParkingTicketDemo {

    public static void main(String[] args) {

        ParkingTicket t1 = new ParkingTicket();

        ParkingTicket t2 =
            new ParkingTicket("TICKET002", "TS04AB1234");

        System.out.println("Ticket 1 Details:");
        t1.displayTicket();

        System.out.println("Ticket 2 Details:");
        t2.displayTicket();
    }
}
