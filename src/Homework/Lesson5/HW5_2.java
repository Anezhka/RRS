package Homework.Lesson5;

/**
 * Дан массив:
 * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
 * необходимо вывести все значения массива больше 5.
 */

public class HW5_2 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                System.out.println(array[i]);
            }
        }
    }
}
