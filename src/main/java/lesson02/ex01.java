package lesson02;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height;
        System.out.println("Введите высоту:");
        height = scanner.nextInt();
        print_isoTriangle(height);
    }

    public static void print_isoTriangle(int height) {
        for (int i = 0; i <= height - 1; i++) {
            for (int j = 0; j < height - 1 - i; j++) {
                System.out.print("  ");
            }
            for (int j = i * 2 + 1; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
