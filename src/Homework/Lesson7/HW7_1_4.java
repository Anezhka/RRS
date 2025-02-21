package Homework.Lesson7;

/**
 * Дан массив:
 * int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
 * необходимо вывести среднее арифметическое всех значений массива.
 */

public class HW7_1_4 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(arithmeticalMean(array));
    }

    public static double arithmeticalMean(int[] arr) {
        double arithmeticalMean;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        arithmeticalMean = sum / (double) arr.length;
        return arithmeticalMean;
    }
}
