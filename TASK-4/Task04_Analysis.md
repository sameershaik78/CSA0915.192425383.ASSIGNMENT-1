# TASK 04 – Implement Classes and Constructors

## AIM
To implement Java classes and objects using constructors, constructor overloading and constructor chaining.

## 1. Class Definition

A class is a blueprint for creating objects. In this program, ParkingTicket is used to store parking ticket information.

## 2. Constructors Used

Two constructors are implemented:

1. Default constructor: Creates a ticket with default values.
2. Parameterized constructor: Creates a ticket using the given ticket number and vehicle number.

## 3. Constructor Overloading

Constructor overloading means defining multiple constructors in the same class with different parameter lists.

## 4. Use of this Keyword

The `this` keyword refers to the current object.

The `this()` statement calls another constructor in the same class. It must be the first statement in a constructor.

## 5. Object Creation

Two objects are created:

- `t1` uses the default constructor.
- `t2` uses the parameterized constructor.

Each object stores its own ticket details.

## 6. Alternative Concept and Complexity Analysis

### Default Constructor and Setter Methods

An object can be created using a default constructor and then its values can be assigned through setter methods.

This approach may create an incomplete object before all fields are assigned.

### Static Factory Method

A static factory method can create and return a ParkingTicket object. It provides a named method for object creation and can perform validation before returning the object.

### Comparison

| Method | Object validity |
|---|---|
| Parameterized constructor | Required values can be provided during creation |
| Default constructor and setters | Object may temporarily contain incomplete values |
| Static factory method | Can validate values before creating or returning an object |

### Complexity

For n ParkingTicket objects:

- Creation time: O(n) overall, assuming constant-time field assignments.
- Space complexity: O(n) for storing n objects.
- Each object creation takes O(1) time and O(1) object space, excluding referenced object internals.

## RESULT

The ParkingTicket class was implemented successfully using default and parameterized constructors. Constructor overloading, constructor chaining and the `this` keyword were demonstrated.