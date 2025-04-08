package Homework.Lesson12;

public final class Manager extends BaseEmployee {

    public int numberOfSubordinates;

    public Manager(String name, int salaryPerDay, int numberOfSubordinates) {
        super(name, salaryPerDay);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary(Month[] monthArray) {
        int salary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            salary += salaryPerDay * monthArray[i].getWorkingDays();
        }
        salary += salary / 100 * 1 * numberOfSubordinates;
        return salary;
    }
}
