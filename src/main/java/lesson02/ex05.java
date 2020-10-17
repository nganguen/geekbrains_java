package lesson02;

import java.util.Arrays;

public class ex05 {
    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1, -1};
        random_change(arr);
    }

    public static void random_change(int[] arr) {
        int rand, temp;
        for (int i = 0; i < arr.length/2; i++) {
            rand = (int) (Math.random() * arr.length);
            temp = arr[i];
            arr[i] = arr[rand];
            arr[rand] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
