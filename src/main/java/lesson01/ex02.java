package lesson01;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        numCheck(a);
    }

    public static void numCheck(int a) {
        if (a < 0)
            System.out.println("Negative");
        else
            System.out.println("Positive");
    }
}

