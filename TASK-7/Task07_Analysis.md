# TASK 07 – METHOD OVERRIDING AND OBJECT METHODS

## AIM
To implement method overriding and override Object class methods in the Campus Smart-Parking System.

## 1. Method Overriding

Method overriding occurs when a subclass provides its own implementation of an inherited method with the same signature and a compatible return type.

In this program, TwoWheeler, Car and ElectricCar override the `ratePerHour()` method to provide their own parking rates.

## 2. @Override Annotation

The @Override annotation informs the compiler that a method is intended to override a superclass method. It helps identify incorrect method signatures.

### Rules of Overriding

1. The method name and parameter list must match.
2. The return type must be the same or compatible.
3. The access level cannot be more restrictive.
4. A final method cannot be overridden.

## 3. final Keyword

- Final variable: Prevents reassignment of the registration number.
- Final method: Prevents subclasses from overriding an important method.
- Final class: Prevents other classes from inheriting it.

The registration number is declared final because it should not change after vehicle creation.

## 4. Object Class Methods

### toString()

Returns a readable representation of the vehicle object.

### equals()

Compares two vehicle objects using their registration numbers.

Two vehicles with the same registration number are considered equal, even if their runtime classes differ.

### hashCode()

Returns a hash code based on the registration number. Equal objects must have equal hash codes.

## 5. Equality Behaviour

A Car and an ElectricCar with the same registration number return true when compared using equals().

This follows the assignment's rule that registration number alone identifies a vehicle.

In a real system, vehicle category could also be included in identity if required by the business rules.

## 6. Alternative Concept and Complexity Analysis

An alternative is to use a single calculateFee() method with a switch statement based on vehicle type.

| Method | Behaviour |
|---|---|
| Method overriding | Each subclass provides its own rate |
| Switch statement | One central method checks vehicle type |

For k vehicle types:

- A switch or sequence of type checks can require up to O(k) comparisons in the worst case.
- A fixed number of operations in an overridden method is O(1) per call.
- Adding a new vehicle type using overriding mainly requires creating a new subclass.
- A switch-based approach requires modifying the central calculation method.

Method overriding provides better separation of vehicle-specific behaviour and maintainability.

## RESULT

Method overriding, @Override, final, toString(), equals() and hashCode() were successfully demonstrated in the Campus Smart-Parking System.