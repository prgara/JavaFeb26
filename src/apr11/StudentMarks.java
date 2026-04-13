package apr11;

import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        Map<Student,Integer> marks = new HashMap<>();
        ArrayList<String> nums = new ArrayList<>();
        nums.add("732983928392");
        nums.add("732983928567");

        Student ram = new Student("Ram", 12, nums);
        marks.put(ram,98);

        ram.getPhoneNos().add("73898392839");

//
//        marks.put(new Student("Sham",13,"987654321"),99);
//        marks.put(new Student("Ghanshyam",14,"987654321"),100);


//        System.out.println(marks);
        System.out.println(marks.get(ram));
    }
}
