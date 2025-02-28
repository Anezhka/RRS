package Homework.Lesson9;

/**
 * Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
 * Имя и ЗП должны быть обязательными, остальные поля — нет.
 * Создать необходимые конструкторы и / или setter-ы (по собственному разумению),
 * чтобы было удобно создавать эти объекты.
 * Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает
 * зарплату за те месяцы которые были переданы в качестве аргумента.
 */

public class Employee {

    public String name;
    public int age;
    public String sex;
    public int salaryPerDay;


    public Manager convertToManager(int numberOfSubordinates) {
        Manager manager = new Manager(name, age, sex, salaryPerDay, numberOfSubordinates);
        return manager;
    }

    public Manager convertToManager2(int numberOfSubordinates) {
        Manager manager = new Manager(this, numberOfSubordinates);
        return manager;
    }

    public Employee(String name, int salaryPerDay) {
        this.name = name;
        this.salaryPerDay = salaryPerDay;
    }

    public Employee(String name, int age, String sex, int salaryPerDay) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salaryPerDay = salaryPerDay;
    }

    public Employee(String name, int age, int salaryPerDay) {
        this.name = name;
        this.age = age;
        this.salaryPerDay = salaryPerDay;
    }

    public Employee(String name, String sex, int salaryPerDay) {
        this.name = name;
        this.sex = sex;
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
