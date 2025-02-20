package Homework.Lesson7;

/**
 * Дан массив:
 * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
 * необходимо вывести минимальное значение массива.
 */

public class HW7_1_3 {

    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        System.out.println(minValue(array));
    }

    public static int minValue(int[] arr) {
        int min = 2147483647;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
