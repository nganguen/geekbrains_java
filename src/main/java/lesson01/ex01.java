package lesson01;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        boolean result = sumCheck(a, b);
        System.out.println(result);
    }

    public static boolean sumCheck(int a, int b) {
        int sum = a + b;
        return ((sum >= 10) && (sum <= 20));
    }
}
