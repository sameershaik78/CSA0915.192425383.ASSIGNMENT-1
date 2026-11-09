

classDiagram

&#x20;   class Vehicle {

&#x20;       <<abstract>>

&#x20;       -String regNo

&#x20;       +getRegNo()

&#x20;       +getType()

&#x20;   }



&#x20;   class Car

&#x20;   class ElectricCar

&#x20;   class TwoWheeler

&#x20;   class EBike

&#x20;   class DeliveryVan



&#x20;   Vehicle <|-- Car

&#x20;   Vehicle <|-- ElectricCar

&#x20;   Vehicle <|-- TwoWheeler

&#x20;   Vehicle <|-- EBike

&#x20;   Vehicle <|-- DeliveryVan



&#x20;   class ParkingSlot {

&#x20;       -int slotNumber

&#x20;       -boolean occupied

&#x20;       -String vehicleNumber

&#x20;       +occupySlot()

&#x20;       +releaseSlot()

&#x20;   }



&#x20;   class ParkingFacility {

&#x20;       -boolean\[]\[] slots

&#x20;       +parkVehicle()

&#x20;       +releaseSlot()

&#x20;       +displayFloorCapacity()

&#x20;   }



&#x20;   class ParkingTicket {

&#x20;       -String ticketId

&#x20;       -String vehicleNumber

&#x20;       -LocalDateTime entryTime

&#x20;       -LocalDateTime exitTime

&#x20;       +calculateDuration()

&#x20;   }



&#x20;   class ParkingFeeCalculator {

&#x20;       +calculateFee()

&#x20;   }



&#x20;   ParkingFacility "1" o-- "\*" ParkingSlot : manages

&#x20;   ParkingTicket "\*" --> "1" Vehicle : records

&#x20;   ParkingFeeCalculator ..> Vehicle : calculates fee for



