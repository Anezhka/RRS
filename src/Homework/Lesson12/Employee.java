package Homework.Lesson12;

public final class Employee extends BaseEmployee {

    public Employee(String name, int salaryPerDay) {
        super(name, salaryPerDay);
    }

    @Override
    public int getSalary(Month[] monthArray) {
        int salary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            salary += salaryPerDay * monthArray[i].getWorkingDays();
        }
        return salary;
    }
}
