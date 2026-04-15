package apr14;

import java.util.Scanner;
import java.util.function.Predicate;

public class Utility<K> {


    void check(Predicate<K> utility){
        System.out.print("Please type a string : ");
        String input = new Scanner(System.in).nextLine();
        System.out.println(utility.test((K) input));
    }
}
