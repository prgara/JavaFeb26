package apr08;

import java.util.Objects;

public class Employee {

    private String name;
    private String dept;
    private double salary;


    public Employee(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(dept, employee.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dept, salary);
    }
}
