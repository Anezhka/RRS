package Homework.Lesson4;

import static java.lang.Math.pow;

public class HW4_2 {
    public static void main(String[] args) {
        int i = 1;
        double result = 0.0;

        while (true) {
            result = pow(5, i);
            if(result > 100000) break;
            System.out.println(result);
            i++;
        }
    }
}
