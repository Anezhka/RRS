package Homework.Lesson12;

public class SalaryUtils {

    static final Month january = new Month("January", 31, 21);
    static final Month february = new Month("February", 28, 19);
    static final Month march = new Month("March", 31, 21);
    static final Month april = new Month("April", 30, 22);
    static final Month may = new Month("May", 31, 21);
    static final Month june = new Month("June", 30, 20);
    static final Month july = new Month("July", 31, 22);
    static final Month august = new Month("August", 31, 21);
    static final Month september = new Month("September", 30, 21);
    static final Month october = new Month("October", 31, 22);
    static final Month november = new Month("November", 30, 18);
    static final Month december = new Month("December", 31, 22);

    public static Month[] getFirstQuater() {
        return new Month[]{january, february, march};
    }

    public static Month[] getSecondQuater() {
        return new Month[]{april, may, june};
    }

    public static Month[] getThirdQuater() {
        return new Month[]{july, august, september};
    }

    public static Month[] getFourthQuater() {
        return new Month[]{october, november, december};
    }

    public static Month[] getFirstHalfOfAYear() {
        return new Month[]{january, february, march, april, may, june};
    }

    public static Month[] getSecondHalfOfAYear() {
        return new Month[]{july, august, september, october, november, december};
    }

    public static Month[] getFullYear() {
        return new Month[]{january, february, march, april, may, june, july, august, september, october, november, december};
    }


    public static void main(String[] args) {

        Month[] month = new Month[] {january, february, march, april, may, june, july, august, september, october, november, december};

        Employee employee = new Employee("Mike", 100);
        Employee employee1 = new Employee("Honza", 100);
        Manager manager = new Manager("David", 100, 1);
        Manager manager1 = new Manager("Jakub", 100, 1);
        Director director = new Director("Jeremy", 100, 4);
        BaseEmployee[] employees = {employee, employee1, manager, manager1, director};

        //int totalSalary = getTotalSalary(employees, month);
        //System.out.println(totalSalary);

        Month[] firstQuater = getFirstQuater();
        print(firstQuater);
    }

    public static void print(Month[] months) {
        for (Month m : months) {
            System.out.println(m.getMonthName());
        }
    }

    public static int getTotalSalary(BaseEmployee[] employees, Month[] months) {
        int totalSalary = 0;
        for (BaseEmployee e : employees) {
            totalSalary += e.getSalary(months);
            System.out.println(e.getSalary(months));
        }
        return totalSalary;
    }
}
