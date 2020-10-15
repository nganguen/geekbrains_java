package lesson01;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        name = scanner.nextLine();
        printout(name);
    }

    public static void printout(String name) {
        System.out.println("Привет " + name + "!");
    }
}
