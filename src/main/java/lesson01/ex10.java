package lesson01;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        year = scanner.nextInt();
        if (isLeapYear(year))
            System.out.println("Обычный");
        else
            System.out.println("Високосный");
    }

    public static boolean isLeapYear(int year) {
        return ((year % 4 != 0) || ((year % 100 == 0) && (year % 400 != 0)));
    }
}