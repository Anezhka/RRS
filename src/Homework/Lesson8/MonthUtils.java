package Homework.Lesson8;

public class MonthUtils {

    public static void main(String[] args) {
        Month january = new Month("January", 31, 21);
        Month february = new Month("February", 28, 19);
        Month march = new Month("March", 31, 21);
        Month april = new Month("April", 30, 22);
        Month may = new Month("May", 31, 21);
        Month june = new Month("June", 30, 20);
        Month july = new Month("July", 31, 22);
        Month august = new Month("August", 31, 21);
        Month september = new Month("September", 30, 21);
        Month october = new Month("October", 31, 22);
        Month november = new Month("November", 30, 18);
        Month december = new Month("December", 31, 22);

        Month[] month = new Month[12];
        month[0] = january;
        month[1] = february;
        month[2] = march;
        month[3] = april;
        month[4] = may;
        month[5] = june;
        month[6] = july;
        month[7] = august;
        month[8] = september;
        month[9] = october;
        month[10] = november;
        month[11] = december;

        Month[] firstQuarter = new Month[]{january, february, march};
        Month[] secondQuarter = new Month[]{april, may, june};
        Month[] thirdQuarter = new Month[]{july, august, september};
        Month[] fourthQuarter = new Month[]{october, november, december};

        Employee vasilij = new Employee("Василий", 25, "male", 2000);
        System.out.println("Работник " + vasilij.name + " в год получает " + vasilij.getSalary(month) + " денег.");
        System.out.println("Работник " + vasilij.name + " в первом квартале получает " + vasilij.getSalary(firstQuarter) + " денег.");
        System.out.println("Работник " + vasilij.name + " во втором квартале получает " + vasilij.getSalary(secondQuarter) + " денег.");
        System.out.println("Работник " + vasilij.name + " в третьем квартале получает " + vasilij.getSalary(thirdQuarter) + " денег.");
        System.out.println("Работник " + vasilij.name + " в четвёртом квартале получает " + vasilij.getSalary(fourthQuarter) + " денег.");

        Manager ivan = new Manager("Иван", 27, "male", 1000, 2);
        System.out.println("Менеджер " + ivan.name + " в год получает " + ivan.getSalary(month) + " денег.");
        System.out.println("Менеджер " + ivan.name + " в первом квартале получает " + ivan.getSalary(firstQuarter) + " денег.");
        System.out.println("Менеджер " + ivan.name + " во втором квартале получает " + ivan.getSalary(secondQuarter) + " денег.");
        System.out.println("Менеджер " + ivan.name + " в третьем квартале получает " + ivan.getSalary(thirdQuarter) + " денег.");
        System.out.println("Менеджер " + ivan.name + " в четвёртом квартале получает " + ivan.getSalary(fourthQuarter) + " денег.");
    }
    public static void printArray(Month[] month) {
        for (Month m : month) {
            System.out.print(m.name + ", ");
        }
    }
}
