package mar31;

public final class Employee {

   private final String name;
   private final String dept;
   private final double salary;

    public String getName() {
        return name;
    }



    public String getDept() {
        return dept;
    }


    public Employee(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", dept='" + dept + '\'' +
//                '}';
//    }
}
