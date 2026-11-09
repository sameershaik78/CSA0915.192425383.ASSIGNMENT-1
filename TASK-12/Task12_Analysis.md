\# TASK 12 – Day 4 Design Challenge



\## AIM

To extend the Campus Smart Parking System by adding new vehicle categories, pricing rules, visitor passes and additional parking floors.



\## PROBLEM REQUIREMENTS

1\. E-bikes must have a flat parking fee.

2\. Delivery vans must pay double the car rate between 9 AM and 5 PM.

3\. Visitors must have a one-day parking pass.

4\. Parking capacity must be expanded from 3 floors to 5 floors.



\## DESIGN IMPACT



\### 1. New Vehicle Classes

\- EBike – Represents an electric bike.

\- DeliveryVan – Represents a delivery van.



Both classes inherit common properties from the Vehicle class.



\### 2. Pricing Changes

The ParkingFeeCalculator class is modified to support:

\- E-bike flat fee: Rs.20.

\- Car rate: Rs.30 per hour.

\- Electric car rate: Rs.40 per hour.

\- Delivery van daytime rate: Rs.60 per hour.

\- Delivery van other-time rate: Rs.30 per hour.

\- Visitor one-day pass: Rs.100.



These amounts are implementation assumptions for this demonstration.



\### 3. Parking Floor Changes

The parking facility is expanded to five floors.



| Floor | Number of Slots |

|---|---:|

| Floor 1 | 2 |

| Floor 2 | 3 |

| Floor 3 | 1 |

| Floor 4 | 4 |

| Floor 5 | 2 |

| Total | 12 |



A jagged array is used because each floor can have a different number of parking slots.



\## DESIGN EVALUATION



\### Original Design

The original system supports cars, two-wheelers and electric cars. Its parking capacity is limited to three floors.



\### Modified Design

The modified system introduces EBike and DeliveryVan subclasses. The fee calculator is updated to handle new pricing rules. The parking facility is expanded to five floors.



\## FINAL DESIGN DECISION

\*\*Decision: MODIFY THE EXISTING DESIGN\*\*



Reasons:

1\. Existing vehicle classes can remain unchanged.

2\. New vehicle categories can be added through inheritance.

3\. Pricing rules are maintained in one calculator class.

4\. The jagged array supports different floor capacities.

5\. Future vehicle categories can be added more easily.



\## TEST CASES



| Test Case | Expected Result | Actual Result |

|---|---|---|

| E-bike flat fee | Rs.20 | Rs.20 |

| Delivery van during 9 AM–5 PM for 2 hours | Rs.120 | Rs.120 |

| Delivery van after 5 PM for 2 hours | Rs.60 | Rs.60 |

| Visitor one-day pass | Rs.100 | Rs.100 |

| Five-floor capacity | 12 slots | 12 slots |



\## COMPLEXITY ANALYSIS

\- Parking slot allocation: O(1) for direct floor and slot indexing.

\- Parking slot release: O(1).

\- Floor capacity display: O(F), where F is the number of floors.

\- Fee calculation: O(1).



\## TRADE-OFFS

Advantages:

\- Easy to extend with new vehicle categories.

\- Centralized pricing logic.

\- Supports different floor capacities.



Limitations:

\- New pricing requirements require changes to the fee calculator.

\- Fixed flat fees and time rules may need additional configuration in a larger system.



\## RESULT

The Campus Smart Parking System was successfully modified to support e-bikes, delivery vans, visitor passes and five parking floors. The test cases produced the expected results.

