package Mar07;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Tom", 89890.0,"IT");
        System.out.println(emp);
        System.out.println(emp.salary);

        Random rn = new Random(10);
        System.out.println("bwjhdbwj" +rn.nextInt());


        int[][] arr = new int[3][2];

        arr[0][0] = 5;
        arr[0][1] = 7;
        arr[1][0] = 4;
        arr[1][1] = 6;
        arr[2][0] = 5;
        arr[2][1] = 7;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0 ; j < arr[i].length; j++){

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

      TwoDArray twoDArray = new TwoDArray(3,2);
        twoDArray.display();
        twoDArray.show();
    }
}
