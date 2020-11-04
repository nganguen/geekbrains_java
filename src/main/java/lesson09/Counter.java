package lesson09;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Counter {

    public static void main(String[] args) {
        String word = "ana";
        int counter = 0;

        File file = new File("C:/Users/geekbrains_java/src/main/java/lesson09/test.txt");
        BufferedReader reader = null;
        List<String> array = new ArrayList<>();

        try {
            reader = new BufferedReader(
                    new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                array.add(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        char[] charWord = word.toCharArray();
        for (int i = 0; i < array.size(); i++) {
            char[] charLine = array.get(i).toCharArray();
            for (int m = 0; m < charLine.length; m++) {
                if (charLine[m] == charWord[0]) {
                    int sum = 1;
                    for (int j = m+1, k = 1; j < charLine.length && k < charWord.length; j++, k++) {
                        if (charLine[j] != charWord[k]) {
                            sum = 0;
                            break;
                        }
                        sum++;
                    }
                    if (sum == charWord.length)
                        counter++;
                }
            }
        }

        System.out.println("Counter = " + counter);
    }
}
