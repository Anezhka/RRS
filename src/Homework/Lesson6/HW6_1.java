package Homework.Lesson6;

/** Дана строка:
 * String s = “Перестановочный алгоритм быстрого действия”;
 * необходимо вывести все буквы “о” из этой строки.
 * Для указанной строки ответ будет “ооооо” (или в столбик)
 */

public class HW6_1 {
    public static void main(String[] args) {

        String str = "Перестановочный алгоритм быстрого действия";

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (letter == 'о') {
                System.out.print(letter);
            }
        }

    }
}
