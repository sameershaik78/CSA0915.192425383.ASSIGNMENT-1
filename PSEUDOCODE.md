\# CAMPUS SMART PARKING SYSTEM

\# PSEUDOCODE



\## 1. Main Parking System



```text

START



Create ParkingFacility

Create ParkingFeeCalculator



Display parking floor capacity



WHILE system is running



&#x20;   Display menu:

&#x20;       1. Park vehicle

&#x20;       2. Exit vehicle

&#x20;       3. Display available slots

&#x20;       4. Calculate parking fee

&#x20;       5. Exit system



&#x20;   Read user choice



&#x20;   IF choice = 1

&#x20;       Read vehicle registration number

&#x20;       Read vehicle type

&#x20;       Read floor number

&#x20;       Read slot number

&#x20;       Validate vehicle and slot details

&#x20;       Allocate parking slot

&#x20;       Generate parking ticket

&#x20;   ELSE IF choice = 2

&#x20;       Read vehicle registration number

&#x20;       Find active parking ticket

&#x20;       Calculate parking duration

&#x20;       Calculate parking fee

&#x20;       Release parking slot

&#x20;       Close parking ticket

&#x20;   ELSE IF choice = 3

&#x20;       Display available and occupied slots

&#x20;   ELSE IF choice = 4

&#x20;       Calculate and display parking fee

&#x20;   ELSE IF choice = 5

&#x20;       STOP system

&#x20;   ELSE

&#x20;       Display "Invalid choice"

&#x20;   END IF



END WHILE



STOP

```



\## 2. Vehicle Management



```text

START



Create abstract class Vehicle



Store registration number



Define getRegNo()

Define getType()



Create subclasses:

&#x20;   Car

&#x20;   ElectricCar

&#x20;   TwoWheeler

&#x20;   EBike

&#x20;   DeliveryVan



Each subclass returns its vehicle type



STOP

```



\## 3. Parking Slot Allocation



```text

START



INPUT floorNumber

INPUT slotNumber



IF floorNumber is invalid

&#x20;   DISPLAY "Invalid floor number"

ELSE IF slotNumber is invalid

&#x20;   DISPLAY "Invalid slot number"

ELSE IF selected slot is occupied

&#x20;   DISPLAY "Slot already occupied"

ELSE

&#x20;   Mark slot as occupied

&#x20;   DISPLAY "Vehicle parked successfully"

END IF



STOP

```



\## 4. Parking Slot Release



```text

START



INPUT floorNumber

INPUT slotNumber



Validate floor and slot numbers



IF floor and slot are valid

&#x20;   Mark selected slot as available

&#x20;   DISPLAY "Slot released successfully"

ELSE

&#x20;   DISPLAY "Invalid floor or slot"

END IF



STOP

```



\## 5. Parking Fee Calculation



```text

START



INPUT vehicleType

INPUT parkingMinutes

INPUT entryTime

INPUT visitorPass



IF visitorPass is TRUE

&#x20;   fee = 100

ELSE IF vehicleType is EBike

&#x20;   fee = 20

ELSE

&#x20;   hours = CEILING(parkingMinutes / 60)



&#x20;   IF vehicleType is TwoWheeler

&#x20;       rate = 10

&#x20;   ELSE IF vehicleType is Car

&#x20;       rate = 30

&#x20;   ELSE IF vehicleType is ElectricCar

&#x20;       rate = 40

&#x20;   ELSE IF vehicleType is DeliveryVan

&#x20;       IF entryTime is from 9 AM to before 5 PM

&#x20;           rate = 60

&#x20;       ELSE

&#x20;           rate = 30

&#x20;       END IF

&#x20;   END IF



&#x20;   fee = hours \* rate

END IF



DISPLAY fee



STOP

```



\## 6. Final Five-Floor Design



```text

START



Create five parking floors



Set floor capacities:

&#x20;   Floor 1 = 2 slots

&#x20;   Floor 2 = 3 slots

&#x20;   Floor 3 = 1 slot

&#x20;   Floor 4 = 4 slots

&#x20;   Floor 5 = 2 slots



Display each floor capacity



Allow vehicle allocation on valid floors



Allow slot release



STOP

```



\## RESULT



The pseudocode describes the major operations of the Campus Smart Parking System, including vehicle management, slot allocation, slot release, fee calculation and five-floor parking management.

