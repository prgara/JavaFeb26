package apr21;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10);
        System.out.println(list.stream()
                .filter(a -> a % 2 == 0)
                .map(a -> a * a)
                .map(String::valueOf)
                .map(s -> s + s)
                .collect(Collectors.toSet()));
//        System.out.println(list);

        System.out.println(list.stream().distinct().skip(2).toList());

        Integer reduce = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum of all the nums is : " + reduce);



        Stream.of(1, 2, 3, 4, 5, 6, "bdjshd", 3.0);

        System.out.println(Stream.generate(() -> (int) (Math.random() * 100)).
                limit(10)
                .sorted(Comparator.reverseOrder()).
                toList());

        List.of(new Student("Harry", "Potter"),
                        new Student("Ram", "Singh"),
                        new Student("Alex", "Dubey"),
                        new Student("Alex", "Dubey"),
                        new Student("Lindy", "Aotter")
                ).stream()
                .sorted((a, b) -> a.lastName.compareTo(b.lastName))
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        List<String> sentences = List.of("HelloWorldgdewhfjehifu", "JavaStreams");
        System.out.println(sentences.stream().max(Comparator.comparingInt(String::length)).get());
        sentences.stream().flatMap(a -> Arrays.stream(a.split(" "))).toList().forEach(System.out::println);


    }
}
