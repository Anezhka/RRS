package Homework.Lesson8;

/**
 * Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день
 * и количество подчиненных. Класс должен иметь метод - getSalary(Month[] monthArray),
 * метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
 * К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.
 */

public class Manager {
    String name;
    int age;
    String sex;
    int salaryPerDay;
    int quantityOfEmployees;

    public Manager(String name, int age, String sex, int salaryPerDay, int quantityOfEmployees) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salaryPerDay = salaryPerDay;
        this.quantityOfEmployees = quantityOfEmployees;
    }

    public int getSalary(Month[] monthArray) {
        int salary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            salary += salaryPerDay * monthArray[i].workDays;
        }
        salary += salary / 100 * quantityOfEmployees;
        return salary;
    }
}
