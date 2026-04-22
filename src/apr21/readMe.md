Stream API

Not a Data structure, but it is used to process collections.
With streams, we can make a pipeline of operations in a functional style which will process the data.
stream cannot modify original data set
A stream can only be consumed once.
stream is lazy loader means it will only work when there is a terminal operation.


streams have 2 type of operations.
- Intermediary -> which return stream again 
- terminatory -> does not return streams again


# Comparable vs Comparator

Comparable is a functional interface having a method name compareTo.
It sorts objects in natural sorting order.

Comparator s a functional interface having a method name compare.
It sorts the objects with user defined logic.


Method reference
A shorthand for lambdas that just call an existing method. Cleaner code, same power.

