package Homework.Lesson6;

/**
 * Дан массив:
 * String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
 * необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
 */
public class HW6_extra {
    public static void main(String[] args) {
        String[][] array = {
                {"Привет", "всем", "кто"},
                {"изучает", "язык", "программирования"},
                {"java"},
        };
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int index = array[i][j].indexOf("е");

                if (index < 0) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
