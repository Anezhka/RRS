package Homework.Lesson10;

public class Director extends Manager {

    public int numberOfSubordinates;
    public Director(String name, int salaryPerDay, int numberOfSubordinates) {
        super(name, salaryPerDay, numberOfSubordinates);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getSalary(Month[] monthArray) {
        int salary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            salary += salaryPerDay * monthArray[i].getWorkingDays();
        }
        salary += salary / 100 * 3 * numberOfSubordinates;
        return salary;
    }
}
