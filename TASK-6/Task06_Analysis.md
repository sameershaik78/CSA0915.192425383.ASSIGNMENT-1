# TASK 06 – DESIGN THE INHERITANCE HIERARCHY

## AIM
To design and implement an inheritance hierarchy for the Campus Smart-Parking System using Java.

## 1. Superclass and Subclasses

Vehicle is the superclass.

The subclasses are:

- TwoWheeler
- Car
- ElectricCar

ElectricCar extends Car, and Car extends Vehicle.

## 2. Types of Inheritance

### Hierarchical Inheritance
TwoWheeler and Car inherit from Vehicle.

### Multilevel Inheritance
ElectricCar inherits from Car, and Car inherits from Vehicle.

### Single Inheritance
Car directly inherits from Vehicle.

## 3. Inherited and Added Members

The Vehicle class contains the common registration number and display method.

TwoWheeler and Car inherit these members and provide their own parking rates.

ElectricCar inherits the members of Car and provides its own parking rate and electric vehicle details.

## 4. Use of super Keyword

- `super(regNo)` calls the parent constructor.
- `super.display()` calls the parent class display method.
- The parent constructor executes before the child constructor body.

## 5. Constructor Execution Trace

When an ElectricCar object is created:

1. Vehicle constructor executes.
2. Car constructor executes.
3. ElectricCar constructor executes.

This demonstrates multilevel constructor chaining.

## 6. UML Class Hierarchy

Vehicle
  |
  |-- TwoWheeler
  |
  |-- Car
         |
         |-- ElectricCar

## 7. Alternative Concept – Composition

Inheritance represents an IS-A relationship. For example, Car IS-A Vehicle.

Composition represents a HAS-A relationship. A Vehicle can HAVE-A VehicleType object that stores its parking rate.

### Comparison

| Inheritance | Composition |
|---|---|
| Uses extends | Uses object references |
| Represents IS-A | Represents HAS-A |
| Suitable for stable vehicle categories | Suitable for changing vehicle types and pricing policies |
| Subclasses provide their own behaviour | VehicleType provides configurable behaviour |

Composition is more flexible when vehicle categories and pricing policies change independently. Inheritance is suitable when the vehicle categories have a stable IS-A relationship.

## RESULT

The vehicle inheritance hierarchy was designed and implemented successfully. Single, hierarchical and multilevel inheritance, constructor chaining and the super keyword were demonstrated.