package Homework.Lesson10;

public class Grade {
    public Grade() {
    }

    public String switchStatement(int i) {
        String oldName = "";
        switch (i) {
            case 1 : oldName = "плохо"; break;
            case 2 : oldName = "неудовлетворительно"; break;
            case 3 : oldName = "удовлетворительно"; break;
            case 4 : oldName = "хорошо"; break;
            case 5 : oldName = "отлично"; break;
            default: oldName = "Укажите число от 1 до 5";
        }
        return oldName;
    }

    public String switchExpression(char c) {
        String oldName = switch (c) {
            case 'A' -> "отлично";
            case 'B' -> "хорошо";
            case 'C' -> "удовлетворительно";
            case 'D' -> "неудовлетворительно";
            case 'F' -> "плохо";
            default -> "Укажите букву от A до F";
        };
        return oldName;
    }


}
