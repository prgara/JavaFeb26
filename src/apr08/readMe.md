Queue -> FIFO offer() -> add to the end, poll() - removes from front, peek() -> check the front element
Stack -> LIFO pop() -> take out the top element, peek() -> check the top element


Set -> collection of unique elements, no duplicates, unordered collection

HashSet - collection of unique elements, no duplicates, unordered collection, backed by HashMap
- default capacity is 16
- load factor 0.75 or 75%
LinkedHashSet - collection of unique elements, no duplicates, maintain insertion order
TreeSet -> collection of unique elements, no duplicates, natural sorting order


given a list, you have to remove all the duplicate elements from it.
[100,200,100,300,400,200,500,400,500,700,900]

Create a list of employee (name, dept & salary) and remove duplicates from the list.


BigONotation -> It defines how performance of your algorithm changes as input size grows.
Space Complexity and Time Complexity


O(1) - Excellent/Best -> constant 
O(log n) - Good -> 
O(n) - Fair -> linear
O(n log n) - Bad - Logarithmic

Time complexity

              ArrayList                                    LinkedList                                 HashSet
Insert           O(n)                                         O(1)                                      O(1)
Get              O(1)                                         O(n)                                       -







