package lesson06;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        System.out.println("Insert array size mxn:");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        String[][] array = new String[rows][columns];
        System.out.println("Insert array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.next();
            }
        }

        int sum = 0;
        try {
            sum = sum(array);
        }
        catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
        catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.printf("Array elememts SUM: %d", sum);
        }
    }

    public static int sum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if ((array.length != 4) && (array[0].length != 4))
            throw new MyArraySizeException("Array size should be 4x4.");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int tmp = Integer.parseInt(array[i][j]);
                    sum +=tmp;
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException("Array element [" + i + "][" + j +"] is not integer.");
                }
            }
        }
        return sum;
    }
}
