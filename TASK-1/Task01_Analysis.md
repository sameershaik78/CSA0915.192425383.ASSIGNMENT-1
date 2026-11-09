\# TASK 1 – Problem Analysis and Candidate Classes



\## AIM

To analyse the Campus Smart Parking System and identify the important classes, objects, attributes and methods.



\## PROBLEM DESCRIPTION

The Campus Smart Parking System manages vehicle parking inside a college campus. It maintains parking slots, vehicle details, parking tickets and fee information. It helps users park vehicles and allows the system to track available and occupied slots.



\## CANDIDATE CLASSES



| Class Name | Purpose |

|---|---|

| Vehicle | Stores common vehicle details |

| Car | Represents a car |

| TwoWheeler | Represents a two-wheeler |

| ElectricCar | Represents an electric car |

| ParkingSlot | Stores parking slot details |

| ParkingFacility | Manages parking floors and slots |

| ParkingTicket | Stores vehicle entry and exit details |

| ParkingFeeCalculator | Calculates parking charges |

| ParkingSystem | Controls the parking operations |



\## ATTRIBUTES AND METHODS



\### 1. Vehicle

Attributes:

\- registrationNumber

\- vehicleType



Methods:

\- getDetails()

\- displayDetails()



\### 2. ParkingSlot

Attributes:

\- slotNumber

\- occupied

\- vehicleNumber



Methods:

\- occupySlot()

\- releaseSlot()

\- displaySlot()



\### 3. ParkingFacility

Attributes:

\- floors

\- slots



Methods:

\- allocateSlot()

\- releaseSlot()

\- displayAvailability()



\### 4. ParkingTicket

Attributes:

\- ticketId

\- vehicleNumber

\- entryTime

\- exitTime



Methods:

\- generateTicket()

\- calculateDuration()



\### 5. ParkingFeeCalculator

Attributes:

\- hourlyRate



Methods:

\- calculateFee()



\## OBJECT-ORIENTED CONCEPTS

1\. Encapsulation – Protecting data using private attributes.

2\. Inheritance – Creating different vehicle types from Vehicle.

3\. Polymorphism – Using method overriding for different vehicle behaviours.

4\. Abstraction – Hiding implementation details using abstract classes and interfaces.



\## RESULT

The Campus Smart Parking System was analysed successfully. The main classes, attributes, methods and object-oriented concepts were identified.

