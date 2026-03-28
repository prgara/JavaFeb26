IS a -> abstract class
Can do -> interface

walking
learning


Exception -> which disrupts the normal flow of execution of program.
- program terminates
- No graceful recovery
- Bad user experience


Throwable
- Exception
- Error -> cannot recover from the error, Out of memory error, StackOverflow

Type of exception
- Runtime Exception - happens at run time. NullPointerException, ArithmeticException
- Compile time exception - happens at compiling. IOException, SQL exception



Exception Handling -> process of handling the exception gracefully to maintain the flow of the program.


Ways to handle exceptions
- try
- catch
- finally
- throw
- throws


try {
 // risky code
} catch {
// catch the exception
}


Flow
- JVM will detect exception
- create exception object
- compare exception obj with caught exception
- execute catch block


WAP to have an array of 5 ele and try to print ele on 6th index
WAP to handle an arithmetic exception.

finally -> always execute. no matter what. used for resource cleanup.

take a string input from user and convert it to lowercase and in the end close the scanner resource.

throw - when we want to throw an exception explicitly.
throws - when we want to delegate the task of exception handling.

WAP to check the age of user for driving. if less than 18 throw custom exception. 

Custom exception -



