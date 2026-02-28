package feb28;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 10;
        marks[1] = 40;
        marks[2] = 50;
        marks[3] = 40;
        marks[4] = 14;

        // marks array and you want to loop over it

        for (int i =0 ; i <5 ;  i++){
            System.out.println(marks[i]);
        }
    }
}
