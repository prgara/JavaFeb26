package apr04;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(5);
//        list.add(5);
//        list.add(5);
//        list.add(5);
//        System.out.println(list.get(3));
//
//        System.out.println(list.size());
        list.add(1, 100);
//        System.out.println(list.contains(50));
//        System.out.println("Index of 100 is : " + list.indexOf(100));
        list.remove(1);
        List<String> countries = new ArrayList<>();
        countries.add("Canada");
        countries.add("India");
        countries.add("Japan");
        countries.add("USA");
        List<String> cities = new ArrayList<>();
        cities.add("Toronto");
        cities.add("New Delhi");
        cities.add("Osaka");
        cities.add("Ottawa");
        cities.add("New York");

        cities.addAll(1, countries);
//        System.out.println(cities);

        /* list with first ele as city, from second ele all the countries and then remaining cities
        [Toronto, Canada, India, Japan,USA, New Delhi, Osaka, Ottawa, New york]
         */

//        System.out.println(list);

        for (int i = 0; i < countries.size(); i++) {
            if (countries.get(i).equals("Japan")) {
                countries.remove("Canada");
            }
        }

        for (String c : countries) {
//            System.out.println(c);
        }

        Iterator<String> iterator = countries.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        List<String> fruits = new LinkedList<>();
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add(2,"Grapes");
        fruits.get(1);
        Iterator<String> iterator1 = fruits.iterator();

        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }


        System.out.println(fruits);


        List<Employee> employees = List.of(new Employee(1, "ram", 123.0),
                new Employee(2, "SHam", 1231.0),
                new Employee(3, "Harry", 2223.0),
                new Employee(4, "pawan", 1234565.0)
        );

        Double maxSalary = (double) Integer.MIN_VALUE;
        String name = "";

//        for (Employee ele : employees){
//           if( ele.getSalary() > maxSalary){
//               maxSalary = ele.getSalary();
//               name = ele.getName();
//           }
//        }


        Iterator<Employee> iterator2 = employees.iterator();
        while (iterator2.hasNext()){
            if( iterator2.next().getSalary() > maxSalary){
                Employee next = iterator2.next();
                maxSalary =  next.getSalary();
               name = next.getName();
           }
        }


        System.out.println("The max salary is : " + maxSalary);
        System.out.println("The max salary employee name is : " + name);
    }



}
