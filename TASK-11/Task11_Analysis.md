
# TASK 11 – Implement, Test and Defend the Design

## AIM
To implement a complete campus smart-parking system using Java and test normal, boundary and invalid cases.

## PROCEDURE
1. Create classes for ParkingTicket and ParkingFacility.
2. Store parking slots using a two-dimensional array.
3. Store active parking tickets using an array.
4. Implement vehicle entry, exit and fee calculation.
5. Test normal, boundary and invalid conditions.

## ALGORITHM
1. Start the parking system.
2. Check the vehicle type and registration number.
3. Validate the floor and slot number.
4. Allocate the slot and create a parking ticket.
5. On exit, calculate the fee and release the slot.

## TEST CASES

| Test | Expected Result | Actual Result |
|---|---|---|
| Car entry | Success | Success |
| Two-wheeler entry | Success | Success |
| 60-minute parking | Rs.30 for car | Rs.30 |
| Zero-minute parking | Rs.0 | Rs.0 |
| Last free slot | Success | Success |
| Unknown vehicle | Rejected | Rejected |
| Duplicate registration | Rejected | Rejected |
| Invalid slot | Rejected | Rejected |
| Electric car, 120 minutes | Rs.80 | Rs.80 |

## ALTERNATIVE DATA STRUCTURES

### 1. Array
- Active tickets are stored in an array.
- Searching for a ticket takes O(n) time.
- Space complexity is O(n).

### 2. ArrayList
- Tickets can be added and removed dynamically.
- Searching takes O(n) time.
- Space complexity is O(n).

### 3. HashMap
- Registration number can be used as the key.
- Searching takes O(1) average time.
- Insertion and deletion take O(1) average time.
- Space complexity is O(n).

## EVALUATION
The array implementation is simple and suitable for a small parking facility with fixed capacity. ArrayList provides dynamic storage, while HashMap provides faster ticket searching using registration numbers.

## RESULT
The campus smart-parking system was implemented successfully in Java. Normal, boundary and invalid test cases were executed and verified.
