package Homework.Lesson9;

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

        Employee vasja = new Employee("Vasja", 25, "male", 1000);
        Manager vasjaManager = vasja.convertToManager(1);
        Manager vasjaManager2 = new Manager(vasja.name, vasja.age, vasja.sex, vasja.salaryPerDay, 1);
        Manager vasjaManager3 = vasja.convertToManager2(1);


        System.out.println(vasja.getSalary(month));
        System.out.println("======");
        System.out.println(vasjaManager.getSalary(month));
        System.out.println("======");
        System.out.println(vasjaManager2.getSalary(month));
        System.out.println("======");
        System.out.println(vasjaManager3.getSalary(month));

    }



}
