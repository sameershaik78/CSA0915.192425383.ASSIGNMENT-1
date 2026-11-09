# TASK 02 – Choose the Data Representation

## AIM
To select suitable Java data types and array structures for representing the Campus Smart-Parking System.

## 1. Data Types Used

| Field | Java data type | Reason |
|---|---|---|
| Slot number | int | Stores the slot number |
| Vehicle number | String | Stores letters and digits |
| Entry time | LocalDateTime | Stores date and time |
| Duration | int | Stores parking duration in minutes |
| Fee | double | Stores decimal parking charges |

## 2. Input Method

The Scanner class is used to read input from the keyboard. It accepts the slot number, vehicle registration number and parking duration.

## 3. Integer Division and Casting Risk

If the duration is 130 minutes, integer division gives:

130 / 60 = 2 hours.

This is incorrect because the extra 10 minutes must also be charged.

To avoid this problem, the program uses:

`int billableHours = (durationMinutes + 59) / 60;`

For 130 minutes, the result is 3 hours. The parking fee is calculated using the hourly rate.

## 4. Array Representation

### Jagged Array

A jagged array uses a separate array for each floor. It supports different numbers of slots on different floors.

Example: `String[][] slots`

### One-Dimensional Array

A one-dimensional array stores all slots in a single array. The index can be calculated using:

`index = floor * slotsPerFloor + slot`

This is suitable when every floor has the same number of slots. Different floor capacities require additional index mapping.

### ArrayList<String[]>

An ArrayList can store a separate slot array for each floor. It supports different floor capacities and can grow dynamically.

## 5. Complexity Analysis

| Representation | Slot access | Space |
|---|---|---|
| Jagged array | O(1) by known indices | O(S) |
| One-dimensional array | O(1) using calculated index | O(S) |
| ArrayList of arrays | O(1) by known indices | O(S) |

Here, S represents the total number of parking slots. Searching for a vehicle by scanning all slots takes O(S) time.

## RESULT

Suitable Java data types and array representations were identified for the Campus Smart-Parking System. Scanner was selected for input, and integer division errors were avoided by calculating the number of started hours correctly.