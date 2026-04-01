Collection is a framework used to store & manipulate group of objects.
- List 
- Set
- Map
- Queue

It works with objects only not primitive. 
Wrapper classes provides mechanism to convert primitive to object and obj to primitive

int -> Integer
float -> Float
double -> Double
boolean -> Boolean
char -> Char
long -> Long
byte -> Byte

Problem before Generics
- No type safety
- Mandatory casting

Boxing -> convert the primitive type to wrapper object
Unboxing -> converting wrapper class to primitive


T -> Type
E -> element
K -> key
V -> value
N -> Number 


SOLID principles


create a container class with 2 generics, student(name,rollNo.), course(courseName, courseId)


Immutable class -> once created, it cannot be changed

How to create a immutable class.
- class final to stop inheritance
- fields private, final 
- remove the setter methods

Records -> since java 16
It is a special class which is immutable by design and no need of the boilerplate code
