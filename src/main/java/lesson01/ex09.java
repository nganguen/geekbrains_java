package lesson01;
import java.util.Arrays;

public class ex09 {
    public static void main(String[] args) {
        int arr[] = {7, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Min = " + min + "\n" + "Max = "+ max);
    }
}
