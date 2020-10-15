package lesson02;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time;
        System.out.println("Введите время в секундах:");
        time = scanner.nextInt();
        printTime(time);
    }

    public static void printTime(int time) {
        int hour = time / 3600;
        if (hour >= 24) {
            System.out.println("Incorrect time");
            return;
        }
        int minutes = (time % 3600) / 60;
        int seconds = (time % 3600) % 60;
        System.out.printf("%02d:%02d:%02d", hour, minutes, seconds);
    }
}
