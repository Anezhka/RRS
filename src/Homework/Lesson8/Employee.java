package Homework.Lesson8;

/**
 * Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
 * Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает
 * зарплату за те месяцы которые были переданы в качестве аргумента.
 */

public class Employee {
    String name;
    int age;
    String sex;
    int salaryPerDay;

    public Employee(String name, int age, String sex, int salaryPerDay) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salaryPerDay = salaryPerDay;
    }
    public int getSalary(Month[] monthArray) {
        int salary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            salary += salaryPerDay * monthArray[i].workDays;
        }
        return salary;
    }


}
