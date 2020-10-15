package lesson01;

public class ex11 {
    public static void main(String[] args) {
        int arr[] = {2, 2, 2, 1, 2, 2, 10, 1};
        boolean result = checkBalance(arr);
        System.out.println(result);
    }

    public static boolean checkBalance(int arr[]) {
        int left_sum, right_sum;
        for (int i = 1; i < arr.length; i++) {
            left_sum = 0;
            right_sum = 0;
            for (int j = 0; j < i; j++) {
                left_sum += arr[j];
            }
            for (int j = arr.length - 1; j >= i; j--) {
                right_sum += arr[j];
            }
            if (left_sum == right_sum)
                return true;
        }
        return false;
    }

    //optimization
    public static void opt_checkBalance(int arr[]) {
        int rightSum = 0;
        for (int val : arr) {
            rightSum += val;
        }
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {

        }
    }
}
