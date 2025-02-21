package Homework.Lesson7;

/**
 * Вывести следующие строки с соответствующим форматированием (как пирамиды):
 * Задача №1
 * 0  1  2  3  4  5  6  7  8  9
 * 0  1  2  3  4  5  6  7  8
 * 0  1  2  3  4  5  6  7
 * 0  1  2  3  4  5  6
 * 0  1  2  3  4  5
 * 0  1  2  3  4
 * 0  1  2  3
 * 0  1  2
 * 0  1
 * 0
 */

public class HW7_2_1 {

    public static void main(String[] args) {

        int[] array = new int[10];
        array = fillInArray(array);
        //System.out.println(Arrays.toString(array));
        printArrayAsPyramid(array);

    }

    public static int[] fillInArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static void printArrayAsPyramid(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            for (int j = 0; j < arr.length - i; j++) {
                System.out.print(arr[j] + "  ");
            }
            System.out.println();
            i++;
        }
        }
    }

