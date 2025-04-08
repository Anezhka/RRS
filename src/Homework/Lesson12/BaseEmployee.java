package Homework.Lesson12;

public abstract class BaseEmployee {

    public String name;
    public int age;
    public String sex;
    public int salaryPerDay;


    protected BaseEmployee(String name, int salaryPerDay) {
        this.name = name;
        this.salaryPerDay = salaryPerDay;
    }

    public abstract int getSalary(Month[] monthArray);

}
