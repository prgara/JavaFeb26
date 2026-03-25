can we override constructor ? No
Can we override a static method ? No

Non-access modifiers -> they provide more functionality
- static 
- final
- abstract

Abstraction -> hiding the implementation and showing the essential functionality. Define the WHAT, not the HOW

2 ways to achieve abstraction
- Abstract classes (0-100 % )
- Interface


Characteristics of abstract class
- We cannot create an object of abstract class, cannot be instantiated. 
- Abstract method does not have body.
- abstract class may or may not have abstract method.


create a class ReportGenerator with abs method generatereport. PDF report, excel report, word report
do this with help of abstraction and overriding.

can we have constructor in abstract class ? Yes



Interface -> It is a contract which a class must have to adhere to.
- All methods in an interface are abstract by default.
- Interface can't have concrete method.
- Use implements keyword to do inheritance.
- we cannot create an object of interface.
- Interface cannot have a constructor
- we can have instance variable/data members
- All the data members are public, static, final/constant by default.

why interfaces ? multiple inheritance

class to class -> extends
class to interface -> implements
interface to interface -> extends






create an interface Logger having method log
ConsoleLog
DbLog
FileLog







