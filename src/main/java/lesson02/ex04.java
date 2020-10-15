package lesson02;

import java.util.Arrays;

public class ex04 {
    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1, -1};
        System.out.println(Arrays.toString(arr));
        reverse_array(arr);
    }

    public static void reverse_array(int[] arr) {
        int temp;
        for (int i = 0; i < (arr.length/2); i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length -1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
