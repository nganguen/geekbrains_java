package lesson01;

public class ex06 {
    public static void main(String[] args) {
        int arr[] = new int[8];
        System.out.println("Array elements:");
        for (int i = 0; i < 8; i++) {
            if (i == 0)
                arr[i] = 2;
            else
                arr[i] = arr[i-1] + 3;
            System.out.print(arr[i] + " ");
        }
    }
}
