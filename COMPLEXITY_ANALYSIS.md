\# CAMPUS SMART PARKING SYSTEM

\# TIME AND SPACE COMPLEXITY ANALYSIS



\## 1. Parking Slot Operations



| Operation | Time Complexity | Explanation |

|---|---|---|

| Access a floor | O(1) | Direct array indexing |

| Access a slot | O(1) | Direct array indexing |

| Allocate a slot | O(1) | Update one array position |

| Release a slot | O(1) | Update one array position |

| Display all floor capacities | O(F) | Visits each floor |



Here, F represents the number of floors.



\## 2. Vehicle and Ticket Operations



| Operation | Time Complexity | Explanation |

|---|---|---|

| Create vehicle object | O(1) | Object creation |

| Get vehicle details | O(1) | Direct field access |

| Search ticket in array | O(n) | May check all tickets |

| Insert ticket in array | O(1) | Insert into an available position |

| Remove ticket from array | O(n) | May require searching and shifting |



Here, n represents the number of active tickets.



\## 3. Data Structure Comparison



| Data Structure | Ticket Exit Lookup | Space Complexity |

|---|---|---|

| Array | O(n) | O(n) |

| ArrayList | O(n) | O(n) |

| HashMap | O(1) average | O(n) |



A HashMap can provide faster average ticket lookup when registration number is used as the key. Its worst-case lookup can be O(n).



\## 4. Fee Calculation



| Operation | Time Complexity | Space Complexity |

|---|---|---|

| Calculate parking duration | O(1) | O(1) |

| Calculate parking fee | O(1) | O(1) |

| Check vehicle category | O(1) | O(1) |

| Apply visitor pass | O(1) | O(1) |



\## 5. Overall Analysis



The system uses arrays and jagged arrays for parking-slot management. These structures provide constant-time access to a known floor and slot.



The ticket array requires linear search to locate a ticket. A HashMap would improve average ticket lookup time to O(1), but it also requires additional storage for its entries.



\## RESULT



The complexity analysis identifies the time and space requirements of the major operations. Direct array indexing is efficient for slot management, while a HashMap is suitable when fast ticket lookup is required.

