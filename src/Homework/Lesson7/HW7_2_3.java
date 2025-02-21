package Homework.Lesson7;

/**
 * Вывести следующие строки с соответствующим форматированием (как пирамиды):
 * Задача №3
 * <p>
 * 9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
 * 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
 * 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
 * 6 5 4 3 2 1 0 1 2 3 4 5 6
 * 5 4 3 2 1 0 1 2 3 4 5
 * 4 3 2 1 0 1 2 3 4
 * 3 2 1 0 1 2 3
 * 2 1 0 1 2
 * 1 0 1
 * 0
 */

public class HW7_2_3 {

    public static void main(String[] args) {

        printPyramid(10);

    }

    public static void printPyramid(int height) {

        for (int i = 0; i < height; i++) {
            printString(i, height);
        }
    }

    private static void printString(int lineNumber, int height) {
        printSpace(lineNumber);
        printNumbers(lineNumber, height);
        System.out.println();
    }

    private static void printSpace(int lineNumber) {
        for (int i = 0; i < lineNumber; i++) {
            System.out.print("   ");
        }
    }

    private static void printNumbers(int lineNumber, int height) {
        for (int i = height - lineNumber - 1; i >= 0; i--) {
            System.out.print(i + "  ");
        }

        for (int i = 1; i < height - lineNumber; i++) {
            System.out.print(i + "  ");
        }
    }
}
