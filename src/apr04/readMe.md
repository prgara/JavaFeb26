Collection framework
- it provides set of classes and interfaces to manipulate and store the group of data.


                            Iterable I                                              Map I <K,V>
                                |                                                       |
                            Collection I                                              HashMap
                                |
           List I              Set I                   Queue I
            |                   |                        |
           ArrayList        HasHSet                   ArrayDeque, Deque I
           LinkedList       LinkedHashSet
                            TreeHashSet



Collection Framework vs Collection interface vs Collections


is map or hashmap part of collection ? NO
Is Map part of collection framework ? yes


List → ordered collection, can contain duplicates

ArrayList -> dynamic array , collection of homogeneous elements which can expand automatically. index based ds
size -> no. of elements currently it holds
capacity -> what it can hold ... initial is 10

load factor->100%

Java 7 -
Initially it will create an array with size 10. and when you try to put the 11th element it will grow by a factor of 1.5X.
and copy all the elements from previous array to new one.

Java 8 -> default size is 0 and on first element insertion it will grow to 10.

/* create 2 list, cities and countries. o/p should be list with first ele as city, 
from second ele all the countries and then remaining cities.
o/p = [Toronto, Canada, India, Japan,USA, New Delhi, Osaka, Ottawa, New York]
*/

When to use ArrayList
read intensive, adding elem at end, iteration

1 2 500 3 4 5 6 7 8 9 1000 get(1)

500 at index 2 

iterate the arraylist
- for loop
- for each
- iterator -> used to iterate over the collection. has 2 methods hasNext() which tells where there is a ele or not 
and next() which will return the next element

Iterate using for loop over a list and try to do manipulation. 

Fail fast -> while iterating over the collection, if you try to modify it will throw ConcurrentModification Exception
Fail safe -> it does not throw ConcurrentModificationException while manipulating the collection over iteration

ArrayList is immutable or not ? No
is it thread safe ?  No
CopyOnWriteArrayList
let say you know there will be 5000 elements in the list. 


LinkedList -> ordered collection, does not have index, not contiguous in memory, contain duplicates, made up of node 
all connected to each other.
node will have 2 objects -> element and memory address
Type -> singly linkedList, doubly & circular linkedList
 when to use LinkedList
- Manipulation


create a employee class with id, name and salary. create a list of employee and get the employee with highest salary.

It is always prefer to use for each with linked list as it keeps a pointer and make use of it while iterating 
whereas for loop will start from first node for each iteration which will be time-consuming and performance will hamper.





