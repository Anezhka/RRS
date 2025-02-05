package Homework.Lesson2;

public class HW2_3 {
    public static void main(String[] args) {
        double totalPiastras = 123429402147832714809732980.0;
        int owner = 1;
        double ownerPiastras;

        int captain = 1;
        double capitanPiastras;

        int pirats = 3;
        double piastrasPerPirat;

        double _50_Percent = totalPiastras / 2;
        ownerPiastras = _50_Percent;

        double _25_Percent = _50_Percent / 2;
        capitanPiastras = _25_Percent;

        double forEach = _25_Percent / (captain + pirats);

        capitanPiastras += forEach;
        piastrasPerPirat = forEach;
        double totalForJackVorobey = ownerPiastras + capitanPiastras;

        System.out.println("Владелец корабля получит " + ownerPiastras + " пиастр.\n"
                + "Капитан получит " + capitanPiastras + " пиастр.\n"
                + "Каждый пират получит " + piastrasPerPirat + " пиастр.\n"
                + "Раз Джэк Воробей утверждает, что корабль принадлежит ему, то он получит " + totalForJackVorobey + " пиастр."
                );

        if ((totalPiastras - (ownerPiastras + capitanPiastras + (piastrasPerPirat * pirats))) < 1) {
            System.out.println("Делёж правильный!");
        } else System.out.println("Что-то не так с делёжкой :(");
    }
}
