package lesson01;

import java.util.Arrays;

public class ex08 {
    public static void main(String[] args) {
        int arr[][]  = new int [10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i == j) || ((10 - j -1) == i) )
                    arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int[] line : arr) {
            System.out.println(Arrays.toString(line));
        }

        int arr1[][] = new int [5][5];
        //optimization
        for (int i = 0; i < arr1.length; i++) {
            arr1[i][i] = 1;
            arr1[i][arr1.length - i - 1] = 1;
        }
        for (int[] line : arr1) {
            System.out.println(Arrays.toString(line));
        }
    }
}
