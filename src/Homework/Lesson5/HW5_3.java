package Homework.Lesson5;

/**
 *  Дан массив:
 *  int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
 *  необходимо увеличить все значения массива на 15.
 */

public class HW5_3 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for (int i = 0; i < array.length; i++) {
            array[i] += 15;
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        for (int i : array) {
            System.out.print(i + ", ");
        }
    }
}
