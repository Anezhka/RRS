package Homework.Lesson10;

public class Employee {

    public String name;
    public int age;
    public String sex;
    public int salaryPerDay;

    public Employee(String name, int salaryPerDay) {
        this.name = name;
        this.salaryPerDay = salaryPerDay;
    }

    public int getSalary(Month[] monthArray) {
        int salary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            salary += salaryPerDay * monthArray[i].getWorkingDays();
        }
        return salary;
    }
}
