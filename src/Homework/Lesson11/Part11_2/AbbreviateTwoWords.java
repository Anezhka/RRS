package Homework.Lesson11.Part11_2;

public class AbbreviateTwoWords {

  public static void main(String[] args) {
    System.out.println(abbrevName("vasya zipkin"));
  }
  public static String abbrevName(String name) {

    String firstLetter = name.substring(0, 1).toUpperCase() + ".";

    int indexOfSecondLetter = name.indexOf(" ") + 1;
    String secondLetter = name.substring(indexOfSecondLetter, indexOfSecondLetter +1).toUpperCase();
    String abbrevName = firstLetter + secondLetter;
    return abbrevName;
  }
}
