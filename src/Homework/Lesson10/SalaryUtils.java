package Homework.Lesson10;

public class SalaryUtils {

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

        Month[] month = new Month[] {january, february, march, april, may, june, july, august, september, october, november, december};

        Employee employee = new Employee("Mike", 100);
        Employee employee1 = new Employee("Honza", 100);
        Manager manager = new Manager("David", 100, 1);
        Manager manager1 = new Manager("Jakub", 100, 1);
        Director director = new Director("Jeremy", 100, 4);
        Employee[] employees = {employee, employee1, manager, manager1, director};

        int totalSalary = getTotalSalary(employees, month);
        System.out.println(totalSalary);

        Grade grade = new Grade();
        System.out.println(grade.switchStatement(5));
        System.out.println(grade.switchExpression('A'));
    }

    public static int getTotalSalary(Employee[] employees, Month[] months) {
        int totalSalary = 0;
        for (Employee e : employees) {
            totalSalary += e.getSalary(months);
            System.out.println(e.getSalary(months));
        }
        return totalSalary;
    }
}
