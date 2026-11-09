# Task 08 – Apply Polymorphism

## AIM
To demonstrate compile-time and runtime polymorphism
using method overloading, method overriding and dynamic
method dispatch in Java.

## Concepts Used
1. Compile-time polymorphism through method overloading.
2. Runtime polymorphism through method overriding.
3. Abstract class Vehicle.
4. Chargeable interface.
5. Dynamic method dispatch.

## Procedure
1. Create an abstract Vehicle class.
2. Create TwoWheeler, Car and ElectricCar subclasses.
3. Override the ratePerHour() method.
4. Implement the Chargeable interface in ElectricCar.
5. Calculate and display the parking and charging fees.

## Algorithm
1. Start the program.
2. Create different vehicle objects.
3. Store the objects in a Vehicle array.
4. Calculate the parking fee using calculateFee().
5. Add the charging fee for chargeable vehicles and display results.

## Runtime Polymorphism
The reference variable is of type Vehicle, but the actual
objects are TwoWheeler, Car and ElectricCar.

Java executes the overridden ratePerHour() method according
to the actual object type. This is called dynamic method dispatch.

## Compile-Time Polymorphism
The displayFee() method is overloaded with different
parameter lists. The compiler selects the matching method
based on the arguments.

## Equality Check
The last line prints true because equals() compares
registration numbers. Both objects have registration
number TN02B2.

This behaviour is correct if registration number alone
identifies a vehicle in the parking system.

## Alternative Concept and Complexity Analysis
If instanceof checks and casting were used for every
vehicle type, the program would need multiple conditions.

With k vehicle types:
- Dynamic method dispatch: O(1) selection.
- Multiple instanceof checks: up to O(k) checks.
- Dynamic dispatch is easier to extend and maintain.

## RESULT
Thus, compile-time and runtime polymorphism were
demonstrated successfully using Java.