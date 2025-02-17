package Homework.Lesson6;

/**
 * Дана строка:
 * String s = “Посмотрите как Рите нравится ритм”;
 * необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
 * Для указанной строки ответ будет 6, 15, 29.
 */

public class HW6_3 {
    public static void main(String[] args) {

        String S = "Посмотрите как Рите нравится ритм";
        String s = S.toLowerCase();
        int index = 0;

        while (true) {
            index = s.indexOf("рит", index);
            if (index < 0) {
                break;
            }
            System.out.print(index + ", ");
            index += 3;
        }

    }
}
