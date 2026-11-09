# Task 09 – Abstract Classes and Interfaces

## AIM
To demonstrate abstraction and interfaces in Java using
a campus smart-parking system.

## Procedure
1. Create an abstract Vehicle class.
2. Declare common vehicle details and an abstract fee method.
3. Create Chargeable and Payable interfaces.
4. Implement the interfaces in Car and ElectricCar classes.
5. Execute the program and verify the output.

## Algorithm
1. Start the program.
2. Create Car and ElectricCar objects.
3. Display vehicle registration numbers.
4. Calculate parking and charging fees.
5. Display the total payment and stop.

## Abstract Class
Vehicle is an abstract class because all vehicles share
common details such as registration number.

It contains a constructor, a private field, a normal method
and an abstract method.

## Interfaces
Chargeable represents the charging capability of electric
vehicles.

Payable represents the payment capability.

ElectricCar implements both interfaces. Java allows a class
to implement multiple interfaces.

## Default and Static Methods
The chargingInfo() and paymentMode() methods are default
methods because they contain method implementations.

getRatePerUnit() is a static interface method and is called
using the interface name.

## Alternative Concept and Complexity Analysis
If Vehicle were an interface instead of an abstract class,
it could not have constructors or ordinary instance fields.

If Chargeable were an abstract class, a class could not
extend both Vehicle and Chargeable because Java supports
only one superclass.

Interfaces allow multiple capabilities to be implemented.

Method calls generally take O(1) time in both designs.
The object stores its instance fields, so object space
depends on the fields it contains.

## RESULT
Thus, abstraction and multiple interfaces were implemented
successfully using Java.