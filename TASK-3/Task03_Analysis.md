# TASK 03 – Design the Control Logic

## AIM
To design the control logic for parking-slot allocation and release and parking-fee calculation.

## 1. Slot Allocation Pseudocode

1. START.
2. Read the vehicle registration number.
3. Repeat for each floor.
4. Repeat for every slot in that floor.
5. If the slot is empty, store the vehicle number and return its floor and slot.
6. If all slots are occupied, return NULL.
7. STOP.

## 2. Parking Fee Calculation Pseudocode

1. START.
2. Read parking duration and vehicle type.
3. Calculate billable hours by rounding up the parking duration to the next started hour.
4. If the vehicle is eligible for a valid monthly pass, set the fee to zero.
5. Otherwise, calculate the fee using the applicable first-hour and additional-hour rates.
6. Apply the daily maximum fee if applicable.
7. Return the final parking fee.
8. STOP.

## 3. Control Statements Used

- `for` loop: Searches floors and parking slots.
- `if`: Checks whether a slot is free.
- `return`: Returns the allocated slot or NULL.
- `if-else`: Validates the floor, slot and fee conditions.

## 4. Alternative Concept and Complexity Analysis

The original approach scans every floor and slot until it finds a free slot.

For F floors and S slots per floor:

- Allocation worst-case time complexity: O(F × S).
- Release time complexity: O(1), when floor and slot are known.
- Parking array space complexity: O(F × S).

### Alternative Approach – Stack of Free Slots

A stack can maintain the available slot positions for each floor.

- Allocation: Pop an available slot from the stack.
- Release: Push the released slot back into the stack.
- A free-slot count can identify whether a floor has available spaces.

With a stack for each floor:

- Allocation time: O(1) for selecting a slot, excluding any search across floors.
- Release time: O(1).
- Additional stack space: O(F × S) in the maximum case.
- Free-slot count space: O(F).

The stack approach is faster for allocation but requires additional memory and careful management to avoid duplicate slot entries.

## RESULT

The parking-slot allocation and release operations were implemented successfully using loops and conditional statements. The expected output was obtained, and the time and space complexities of the original and alternative approaches were analysed.