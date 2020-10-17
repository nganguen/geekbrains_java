package lesson02;

import java.util.Arrays;

public class ex02 {
    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1, -1};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int [] arr) {
        int min;
        int ind_min;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            ind_min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    ind_min = j;
                }
            }
            if (ind_min != i) {
                arr[ind_min] = arr[i];
                arr[i] = min;
            }
        }
        return arr;
    }
}
