package Homework.Lesson7;

/**
 * Дан массив:
 * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
 * необходимо вывести сумму элементов массива.
 */

public class HW7_1_5 {

    public static void main(String[] args) {

        int[][] array = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9},
            {-1, -2, -3, -4},
            {-5, -6}
        };
        System.out.println(summ(array));
    }

    public static int summ(int[][] arr) {
        int summ = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                summ += arr[i][j];
            }
        }
        return summ;
    }
}
