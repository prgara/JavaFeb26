package mar28;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String s = null;
//        int a =10/0;
        try {
            int x = 10/0; // Arithmetic exception
            s.toUpperCase();
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("Null pointer exception handled");
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
        System.out.println("Hello world");


    }
}
