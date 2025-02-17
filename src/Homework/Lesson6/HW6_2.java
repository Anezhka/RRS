package Homework.Lesson6;

/**
 * Дана строка:
 * String s = “Перевыборы выбранного президента”;
 * необходимо подсчитать количество букв “е” в строке.
 * Для указанной строки ответ будет 4.
 */

public class HW6_2 {
    public static void main(String[] args) {
        String s = "Перевыборы выбранного президента";
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (letter == 'е') {
                total++;
            }
        }
        System.out.println(total);
    }
}
