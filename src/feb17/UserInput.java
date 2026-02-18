package feb17;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        System.out.println("Enter a number to find whether it os odd or even : ");

        Scanner sc = new Scanner(System.in); // creating an object of Scanner class
        int a = sc.nextInt(); // getting int input from user and assigning to a var

        if (a %2 ==0){
            System.out.println("Even num");
        } else {
            System.out.println("Odd num");
        }
    }
}
