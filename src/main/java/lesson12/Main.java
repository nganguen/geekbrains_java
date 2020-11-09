package lesson12;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        //Task 01
        String line = "kfgjkf kgjnfk fgjkhg fgkjf dfgdfg dfgdf s fwefg dfgdfdg d" +
                "kfgjkf kgjnfk fgjkhg fgkjf dfgdfg dfgdf s fwefg dfgdfdg d" +
                "kfgjkf kgjnfk fgjkhg fgkjf dfgdfg dfgdf s fwefg dfgdfdg d" +
                "kfgjkf kgjnfk fgjkhg fgkjf dfgdfg dfgdf s fwefg dfgdfdg d" +
                "kfgjkf kgjnfk fgjkhg fgkjf dfgdfg dfgdf s fwefg dfgdfdg d" +
                "kfgjkf kgjnfk fgjkhg fgkjf dfgdfg dfgdf s fwefg dfgdfdg d" +
                "kfgjkf kgjnfk fgjkhg fgkjf dfgdfg dfgdf s fwefg dfgdfdg d" +
                "kfgjkf kgjnfk fgjkhg fgkjf dfgdfg dfgdf s fwefg dfgdfdg d" +
                "kfgjkf kgjnfk fgjkhg fgkjf dfgdfg dfgdf s fwefg dfgdfdg d" +
                "kfgjkf kgjnfk fgjkhg fgkjf dfgdfg dfgdf s fwefg dfgdfdg d";

        String result =  Stream.of(line).flatMap(words -> Arrays.stream(words.split(" ")))
                .filter(word -> word.length() > 5)
                .collect(Collectors.joining(" "));
        System.out.println("Task 01: " + result);

        //Task 02
        String[][] wordArray = {{"apple", "orange", "lemon", "banana", "grapes"},
                                {"apple", "orange", "lemon", "banana", "grapes"},
                                {"apple", "orange", "lemon", "banana", "grapes"},
                                {"apple", "orange", "lemon", "potato", "grapes"},
                                {"apple", "orange", "tomato", "banana", "grapes"}};

        Set<String> distinctWord = Arrays.stream(wordArray).flatMap(words -> Arrays.stream(words))
                .collect(Collectors.toSet());

        System.out.print("Task 02: ");
        for (String word : distinctWord) {
            System.out.printf("%s ", word);
        }
        System.out.println();

        //Task 03
        IntStream rangedIntStream = IntStream.rangeClosed(100, 200);
        int sum = rangedIntStream.filter(num -> num % 2 == 0)
                .sum();
        System.out.println("Task 03: " + sum);

        /*int counter = 0;
        for (int i = 100; i < 201; i++) {
            if (i % 2 == 0) counter+=i;
        }
        System.out.println("Check: " + counter);*/

        //Task 04
        String[] array = {"qgh fgn", "o", "l", "b", "g"};
        Stream<String> stream = Stream.of(array);
        System.out.println("Task 04: "+ stream.map(str -> str.length()).reduce(0, (acc, str) -> acc + str));

        //Task 05
        Stream<String> stream1 = Stream.of("apple", "ana", "lemon", "banana", "grapes");
        System.out.print("Task 05: ");
        stream1.sorted().limit(3).forEach(z -> System.out.printf("%s ", z));
    }
}
