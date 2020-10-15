package lesson01;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        boolean result = isNegative(a);
        System.out.println(result);
    }

    public static boolean isNegative(int a) {
        if (a < 0)
            return true;
        else
            return false;
    }
}
