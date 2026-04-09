package apr08;

import apr08.Employee;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("Orange");
        queue.offer("Apple");
        queue.offer("Banana");
        queue.add("Grapes");

//        System.out.println(queue.peek());


//        System.out.println(queue);

        Stack<Integer> nums = new Stack<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
//        System.out.println(nums.pop());

//        System.out.println(nums);


        Set<Integer> uniqueNums = new HashSet<>();
        uniqueNums.add(100);
        uniqueNums.add(500);
        uniqueNums.add(400);
        uniqueNums.add(300);
        uniqueNums.add(200);
//        uniqueNums.remove(500);
//        uniqueNums.clear();


//        System.out.println(uniqueNums.contains(100));
        System.out.println(uniqueNums);

        Set<String> names = new TreeSet<>();
        names.add("Ronak");
        names.add("Mayur");
        names.add("Shahsi");
        names.add("Pradeep");
        names.add("Dipan");
        names.add("Ishan");


        System.out.println(names);


        List<Employee> employees = List.of(new Employee("Mayur", "IT", 100000.0),
//                new Employee("RonaK", "IT", 100000.0),
//                new Employee("RonaK", "IT", 100000.0),
//                new Employee("Shashi", "HR", 100000.0),
//                new Employee("Pradeep", "Sales", 100000.0),
                new Employee("Ishan", "Procurement", 100000.0),
                new Employee("Ishan", "Procurement", 100000.0)
        );

        Set<Employee> employeeSet = new HashSet<>(employees);
        System.out.println(employeeSet);

        Employee ronak = new Employee("RonaK", "IT", 100000.0);
        Employee ronak1 = new Employee("RonaK", "IT", 100000.0);
        System.out.println(ronak1.hashCode());
        System.out.println(ronak.hashCode());


    }
}
