package Homework.Lesson7;

/**
 * Дан массив:
 * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
 * необходимо вывести максимальное значение массива.
 */

public class HW7_1_2 {

    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        System.out.println(maxValue(array));
    }
    public static int maxValue(int[] arr) {
        int max = -2147483648;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
