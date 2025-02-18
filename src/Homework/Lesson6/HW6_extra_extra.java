package Homework.Lesson6;

import java.util.Arrays;

/**
 * Создайте массив размером 5 на 5 (или 10 на 10, или любого другого размера так, чтобы количество строк и количество столбцов совпадало).
 *
 * Преобразуйте этот массив таким образом, чтобы то, что было строками, стало столбцами и наоборот. Внимание! Не надо менять структуру массива. Задание требует только переместить элементы массива.
 *
 * Тип элементов массива может быть любой по вашему выбору.
 */

public class HW6_extra_extra {
    public static void main(String[] args) {

        int[][] numbers = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
        };

        int tmp;

        //int[][] newArray = new int[numbers.length][numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                //newArray[i][j] = numbers[j][i];
                tmp = numbers[i][j];
                numbers[i][j] = numbers[j][i];
                numbers[j][i] = tmp;
            }
        }
        Arrays.stream(numbers).map(Arrays::toString).forEach(System.out::println);
    }

}
