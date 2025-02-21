package Homework.Lesson7;

/**
 * Вывести следующие строки с соответствующим форматированием (как пирамиды):
 * Задача №2
 * <p>
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

public class HW7_2_2 {

    public static void main(String[] args) {

        printPyramid(10);

    }

    public static void printPyramid(int height) {
        for (int i = 0; i < height; i++) {
            printString(i, height);
        }
    }

    public static void printString(int lineNumber, int height) {
        printSpace(lineNumber);
        printNumbers(lineNumber, height);
        System.out.println();
    }

    public static void printSpace(int lineNumber) {
        for (int i = 0; i < lineNumber; i++) {
            System.out.print("   ");
        }
    }

    public static void printNumbers(int lineNumber, int height) {
        for (int i = 0; i < height - lineNumber; i++) {
            System.out.print(i + "  ");
        }
    }
}
