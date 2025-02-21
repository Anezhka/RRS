package Homework.Lesson7;

/**
 * Задача №1
 *
 * Необходимо написать 4 метода:
 * сложение 2х чисел
 * вычитание 2х чисел
 * умножение 2х чисел
 * деление 2х чисел
 */

public class HW7_3_1 {

    public static void main(String[] args) {
        try {
            System.out.println(division(21, 0));
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        }
        System.out.println(addition(2, 5));
        System.out.println(subtraction(7, 4));
        System.out.println(multiplication(6, 9));
        divisionSafe(99, 0);
    }

    private static int addition(int a, int b) {
        int result = a + b;
        return result;
    }

    private static int subtraction(int a, int b) {
        int result = a - b;
        return result;
    }

    private static int multiplication(int a, int b) {
        int result = a * b;
        return result;
    }

    private static int division(int a, int b) {
        int result = a / b;
        return result;
    }

    private static void divisionSafe(int a, int b) {
        try {
            System.out.println(division(a, b));
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        }
    }
}
