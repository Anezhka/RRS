package Homework.Lesson6;

import java.util.Arrays;

public class lesson6 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1.clone();
        arr1[0] = -1;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        String str = "Hello, everybody!";
        System.out.println(str.substring(0, 6));
        System.out.println(str.substring(12));
        System.out.println(str.substring(str.length() - 5));
        System.out.println(str.charAt(5));
        System.out.println(str.equals("bcvdg"));
        System.out.println(str.compareTo("aeaa"));
        System.out.println(str.contains("eve"));

        int indexOfr = str.indexOf("r");
        if (indexOfr < 0) {
            System.out.println("No such letter");
        } else System.out.println(str.substring(indexOfr));

        int indexOfo = str.lastIndexOf("o");
        if (indexOfo < 0) {
            System.out.println("No such letter");
        } else System.out.println(str.substring(indexOfo));


        String string = "в лесу родилась елочка";

        String[] words = string.split(" ");

        System.out.println(Arrays.toString(words));
        System.out.println(words.length);



        String[] months = {"январь", "февраль", "март", "апрель", "май",
        "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};

        for (int i = 0; i < months.length; i++) {
            if (months[i].endsWith("ь")) {
                System.out.println(months[i]);
            }
        }

        String[] result = new String[months.length];
        for (int i = 0; i < months.length; i++) {
            result[i] = months[i].toUpperCase();
        }
        System.out.println(Arrays.toString(result));

        String[] resultReverse = new String[months.length];
        for (int i = 0; i < months.length; i++) {
            resultReverse[months.length - i - 1] = months[i].toUpperCase();
        }
        System.out.println(Arrays.toString(resultReverse));
        System.out.println();

        int[] quantityOflettersPerMonth = new int[months.length];
        for (int i = 0; i < months.length; i++) {
            quantityOflettersPerMonth[i] = months[i].length();
        }
        System.out.println(Arrays.toString(quantityOflettersPerMonth));
        System.out.println();

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int[] numbersReverse = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbersReverse[numbers.length - i - 1] = numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbersReverse));
        System.out.println();

        int[] arrayForReverse = {3, 5, 7, 9, 11, 13}; // 6
        for (int i = 0; i < arrayForReverse.length / 2; i++) {
            int temp = arrayForReverse[i];
            arrayForReverse[i] = arrayForReverse[arrayForReverse.length - i - 1];
            arrayForReverse[arrayForReverse.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arrayForReverse));

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int daysInYear = 0;
        for (int i = 0; i < daysInMonth.length; i++) {
            daysInYear += daysInMonth[i];
        }
        System.out.println(daysInYear);
    }
}
