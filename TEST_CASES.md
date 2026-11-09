\# CAMPUS SMART PARKING SYSTEM

\# CONSOLIDATED TEST CASES



\## 1. Basic Data and Parking Tests



| Test ID | Test Description | Expected Result |

|---|---|---|

| TC01 | Store vehicle details | Vehicle details stored correctly |

| TC02 | Create parking slot | Slot created successfully |

| TC03 | Allocate an available slot | Vehicle is parked successfully |

| TC04 | Release an occupied slot | Slot becomes available |

| TC05 | Allocate an already occupied slot | Display slot occupied message |

| TC06 | Enter an invalid slot number | Display invalid slot message |



\## 2. Object-Oriented Programming Tests



| Test ID | Concept | Expected Result |

|---|---|---|

| TC07 | Constructor overloading | Correct constructor is executed |

| TC08 | Static members | Shared static values are maintained |

| TC09 | Inheritance | Subclass accesses inherited members |

| TC10 | Method overriding | Subclass implementation is executed |

| TC11 | Encapsulation | Private data is accessed through methods |

| TC12 | Abstraction | Abstract methods are implemented by subclasses |

| TC13 | Interface implementation | Implementing class provides required methods |



\## 3. Complete System Validation – Task 11



| Test ID | Test Description | Expected Result |

|---|---|---|

| TC14 | Park a valid car | Car is parked successfully |

| TC15 | Park a valid two-wheeler | Two-wheeler is parked successfully |

| TC16 | Exit a parked vehicle | Ticket is closed and slot released |

| TC17 | Park in the last available slot | Vehicle is accepted |

| TC18 | Park for zero minutes | Zero billable hours |

| TC19 | Park for exactly 60 minutes | One billable hour |

| TC20 | Park for 61 minutes | Two billable hours |

| TC21 | Enter an unknown vehicle type | Invalid vehicle type is rejected |

| TC22 | Enter duplicate registration number | Duplicate vehicle is rejected |

| TC23 | Enter an invalid slot number | Invalid slot is rejected |



\## 4. Design Challenge Tests – Task 12



| Test ID | Test Description | Expected Result |

|---|---|---|

| TC24 | E-bike flat fee | Rs.20 |

| TC25 | Delivery van during 9 AM–5 PM for 2 hours | Rs.120 |

| TC26 | Delivery van after 5 PM for 2 hours | Rs.60 |

| TC27 | Visitor one-day pass | Rs.100 |

| TC28 | Display five-floor capacity | Five floors displayed |

| TC29 | Calculate total parking capacity | 12 slots |

| TC30 | Park a vehicle on Floor 5 | Valid allocation succeeds |

| TC31 | Enter an invalid floor | Invalid floor is rejected |



\## 5. Test Result Summary



The test cases cover:

\- Normal parking and vehicle exit operations.

\- Parking slot allocation and release.

\- Object-oriented programming concepts.

\- Boundary conditions and invalid inputs.

\- New vehicle categories and pricing rules.

\- Five-floor parking capacity.



\*\*Important:\*\* Enter PASS or FAIL in your final report only after checking the corresponding program output or screenshot. The expected results above are test specifications, not a claim that every test was executed.



\## RESULT



The consolidated test plan provides a structured method to evaluate the Campus Smart Parking System. It covers basic operations, object-oriented concepts, validation, boundary cases and the final design challenge.

