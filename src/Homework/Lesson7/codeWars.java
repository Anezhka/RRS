package Homework.Lesson7;

public class codeWars {

    public static void main(String[] args) {
        int[] array = {8, 76, 2, 98, -4, -34, 0, 13};

        //System.out.println(doubleInteger(5));
        //System.out.println(isLove(13, 14));
        //System.out.println(numberToString(23));
        //System.out.println(findSmallestInt(array));
        System.out.println(countingSheep(7));
    }

    public static int doubleInteger(int i) {
        // Double the integer and return it!
        i = i * 2;
        return i;
    }

    public static boolean isLove(final int flower1, final int flower2) {
        if ((flower1 % 2 == 0 && flower2 % 2 != 0) || (flower1 % 2 != 0 && flower2 % 2 == 0)) {
            return true;
        } else
        return false;
    }

    public static String numberToString(int num) {
        String value = (String.valueOf(num));
        return value; // Return a string of the number here!
    }

    public static int findSmallestInt(int[] array) {
        int min = 2147483647;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static String countingSheep(int num) {
        String result = "";
        for (int i = 1; i <= num; i++) {
            result += i + " sheep...";
        }
        return result;
    }
}
