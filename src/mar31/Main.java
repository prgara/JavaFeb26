package mar31;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(10);
        list.add(10);


        int x = 10;
        Integer a = x; // autoboxing  Integer.valueOf(10)


        Integer obj = Integer.valueOf(100);
        int prim = obj;  // unboxing



//        System.out.println(list);

        Container<String> cont = new Container<>("100L","true");
        Container<Integer> intCont = new Container<>(11,11);

//        System.out.println(cont);


        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ram",101));
        students.add(new Student("Sham",102));
        students.add(new Student("Geeta",103));

        for (Student e : students ) {
//            System.out.println(e);
        }

        Employee emp = new Employee("Seyam","IT",10000);
        System.out.println(emp);

        Course course = new Course("Science",101);
        System.out.println(course.courseId());
        System.out.println(course.courseName());
        System.out.println(course);


    }
}
