HashMap is thread safe ???? No

ConcurrentHashMap 
hashTable - no null allowed


Java 8 features
- functional interface
- default method in interfaces
- Lambdas
- Stream API
- Data Time API
- Optional class
- :: operator
- Completable future


## functional interface
an interface with only one abstract method.
it can have static concrete method.
var are by default public static and final.
it can default method also which have body or are concrete methods. it is for backward compatibility.
no constructor 
no object


Anonymous inner class


Lambda
it is used to express the instance of a functional interface
() -> {}



create a functional interface having 1 abstract method and then create an Anonymous inner class and then convert it to a lambdas


In built functional interfaces

- predicate -> it takes an input and evaluate & returns a boolean value. method name is test
- Consumer
- Supplier
- Function 
- Biconsumer
- BiSupplier