
class TicketCounter {

    // Shared static variables
    private static long nextTicketNo = 1;
    private static int activeTickets = 0;
    private static String facilityName;

    // Static initialization block
    static {
        facilityName = "Campus Smart Parking";
        System.out.println("Static block: System initialized");
    }

    // Static method to generate unique ticket number
    public static synchronized long nextId() {
        return nextTicketNo++;
    }

    public static void ticketEntered() {
        activeTickets++;
    }

    public static void ticketExited() {
        activeTickets--;
    }

    public static int getActiveTickets() {
        return activeTickets;
    }

    public static String getFacilityName() {
        return facilityName;
    }
}

// Parking ticket class
class ParkingTicket {

    private long ticketNo;
    private String vehicleNo;

    public ParkingTicket(long ticketNo, String vehicleNo) {
        this.ticketNo = ticketNo;
        this.vehicleNo = vehicleNo;
    }

    public void display() {
        System.out.println("Ticket Number: " + ticketNo);
        System.out.println("Vehicle Number: " + vehicleNo);
    }
}

// Parking system class
class ParkingSystem {

    // Method returning a ParkingTicket object
    public ParkingTicket createTicket(String vehicleNo) {

        ParkingTicket ticket = new ParkingTicket(
            TicketCounter.nextId(), vehicleNo
        );

        TicketCounter.ticketEntered();

        return ticket;
    }

    // Method receiving a ParkingTicket object
    public void printTicket(ParkingTicket ticket) {
        ticket.display();
    }
}

// Main class
public class StaticDemo {

    public static void main(String[] args) {

        ParkingSystem system = new ParkingSystem();

        System.out.println("Facility: " +
            TicketCounter.getFacilityName());

        ParkingTicket t1 =
            system.createTicket("TS04AB1234");

        ParkingTicket t2 =
            system.createTicket("TS04CD5678");

        System.out.println("\nFirst Ticket:");
        system.printTicket(t1);

        System.out.println("\nSecond Ticket:");
        system.printTicket(t2);

        System.out.println("\nActive Tickets: " +
            TicketCounter.getActiveTickets());

        // Vehicle exits
        TicketCounter.ticketExited();

        // Remove the reference to the first ticket
        t1 = null;

        System.out.println("\nAfter First Vehicle Exits:");
        System.out.println("Active Tickets: " +
            TicketCounter.getActiveTickets());

        System.out.println("\nSecond Ticket Still Active:");
        system.printTicket(t2);

        System.out.println("\nNext Ticket Number: " +
            TicketCounter.nextId());
    }
}
