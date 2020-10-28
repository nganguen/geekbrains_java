package lesson08;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex01 {

    public static void main(String[] args) {
        String[] array = {"int", "float", "double", "int", "char", "string", "char",
                "byte", "boolean", "banana", "apple", "banana", "orange", "java", "int"
        };

        TreeMap<String, Integer> counter = new TreeMap<>();

        for (String word : array) {
            counter.put(word, 0);
        }

        for (String word : array) {
            counter.put(word, (counter.get(word) + 1));
        }

        for (Map.Entry<String, Integer> word : counter.entrySet()) {
            System.out.printf("%s ", word.getKey());
        }

        System.out.println();
        for (Map.Entry<String, Integer> word : counter.entrySet()) {
            System.out.println(word.getKey() + ": " + word.getValue());
        }
    }
}
