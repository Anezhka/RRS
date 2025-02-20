package Homework.Lesson7;

/**
 * Дан массив:
 * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
 * необходимо вывести количество элементов в массиве.
 */

public class HW7_1_7 {

    public static void main(String[] args) {

        int[][] array = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9},
            {-1, -2, -3, -4},
            {-5, -6}
        };
        System.out.println(quantity(array));
    }

    public static int quantity(int[][] arr) {
        int quantity = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                quantity++;
            }
        }
        return quantity;
    }
}
