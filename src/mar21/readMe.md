Inheritance -> It allows to inherit the properties from another class
Parent class/Base class
Child class/Derived class
extend keywords

Adv is code reusability.
w/o inheritance there will be code duplication and will be harder to manage.
Tight coupling

when to use in inheritance
IS A relationship

when not to use inheritance 
Composition
HAS A relationship -> car has a engine

vehicle, Car
engine



type of inheritance
- Single inheritance ->  when there is one class
- class A {}
- class B extends A {}

Hierarchical inheritance
A
B extends A
C extends A

Mutlilevel
A -> B -> C


Multiple Inheritance
D -> A,B,C

Java does not allow multiple inheritance

Diamond problem
if class extends from 2 parent class and if those classes have same name method then it will be ambiguity for child class that
method will execute from which parent class.

create a class person and then a Employee class extends person and then create manager class
which extends Employee


# Super keyword
used to access parent class attributes and behaviour.

every class parent class is Object class


if child class have a method it will get executed else it will look in parent class for that method.


# Polymorphism
many forms. methods behaves differently based on context.
An ability of the method to behave differently based on object.

- Types
- Compile Time -> method overloading Static Polymorphism
same method name with different params list. happens at compile time.

WAP create a class Area and 2 overloaded methods to find the area of square and rectangle.

- Runtime -> method overriding, dynamic Polymorphism
- Happens at runtime, decides which method to call
- behaviour depends on object not reference


Payment have method pay
- credit card, debit card, netbanking, UPI


Encapsulation
- data hiding for accessibility, protection
- wrapping up the var and method in a single unit

make the var as private and provide getter setter methods for read and write

Access modifiers
- public -> accessible to everyone
- private -> accessible in the same class only
- protected -> accessible in the same class only and in other package child class
- default 
package A and class A and a protected var
package B and class B extending class A





