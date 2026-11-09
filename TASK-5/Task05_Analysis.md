# TASK 05 – Apply Static Members and the Object Life Cycle

## AIM
To demonstrate static variables, static methods, static initialization blocks and the object life cycle in Java.

## 1. Static Variables

Static variables belong to the class and are shared by all objects.

In this program:

- `nextTicketNo` generates unique ticket numbers.
- `activeTickets` stores the total number of active parking tickets.
- `facilityName` stores the common parking facility name.

An instance variable would be unsuitable for the shared ticket counter because every object would have its own separate counter.

## 2. Static Methods

The following static methods are used:

- `nextId()` generates the next ticket number.
- `ticketEntered()` increases active ticket count.
- `ticketExited()` decreases active ticket count.
- `getActiveTickets()` returns the current count.

These methods are called using the class name without creating a TicketCounter object.

## 3. Static Initialization Block

The static block initializes the facility name when the TicketCounter class is initialized. It executes once for that class initialization.

## 4. Object Life Cycle

1. A ParkingTicket object is created when a vehicle enters.
2. The object is referenced by the active-ticket collection or a variable.
3. When the vehicle exits, its ticket is removed from the active collection.
4. If no reachable references remain, the object becomes eligible for garbage collection.
5. The Java garbage collector reclaims its memory automatically.

## 5. Passing and Returning Objects

The `createTicket()` method creates and returns a ParkingTicket object.

The `printTicket()` method accepts a ParkingTicket object as a parameter and displays its details.

Java passes object references by value. A method receives a copy of the reference, which points to the same object.

## 6. Static Members and Instance Members

| Static member | Instance member |
|---|---|
| Belongs to the class | Belongs to an object |
| Shared by all objects | Each object has its own value |
| Example: ticket counter | Example: vehicle number |
| Accessed using class name | Accessed using object reference |

## RESULT

Static variables, static methods and static initialization blocks were implemented successfully. Object passing, object returning and garbage collection eligibility were also demonstrated using the Campus Smart-Parking System.