package Homework.Lesson2;

public class HW2_1 {
    public static void main(String[] args) {
        int a = 167;
        int b = 16;

        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a % b);

        if (a % 2 == 0) {
            System.out.println("Число " + a + " - чётное.");
        } else System.out.println("Число " + a + " - нечётное.");

        if (b % 2 == 0) {
            System.out.println("Число " + b + " - чётное.");
        } else System.out.println("Число " + b + " - нечётное.");
    }
}
