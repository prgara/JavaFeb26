package apr14;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
//        CalImpl cal = new CalImpl();
//        System.out.println(cal.add(2, 8));


        List<String> names = Arrays.asList("Ram", "Sham", "Poojas", "Mehak");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        Collections.sort(names, (o1,o2) -> Integer.compare( o1.length(),o2.length()));
        System.out.println(names);

        ICalculator cal1 = ( a,  b) -> a+b;



        System.out.println(cal1.add(10, 5));


        Utility<String> utility = new Utility<>();
//        utility.check((a) -> a.length() > 5 && a.charAt(2) == 'a');

        Predicate<String> check = (String a) -> a.length() > 5 && a.charAt(2) == 'a';

        System.out.println(check.test("Amnprret"));
        Supplier<String> supplier = () -> "Hello, world !!";
        System.out.println(supplier.get());

        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("Consumer interface");

        Function<String, Integer> function = (a) -> a.length();
        System.out.println(function.apply("Hello"));

    }
}
