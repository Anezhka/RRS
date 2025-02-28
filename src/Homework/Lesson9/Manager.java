package Homework.Lesson9;

/**
 * Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных.
 * Поля должны быть спрятаны, для каждого поля создать getter.
 * Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату
 * за те месяцы которые были переданы в качестве аргумента.
 * К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.
 *
 * В классе Employee создать метод convertToManager(int numberOfSubordinates).
 * Этот метод создаст и вернет объект типа Manager с теми же личными данными, что были у Employee,
 * и запишет переданное в него количество подчиненных.
 */

public class Manager {

    private String name;
    private int age;
    private String sex;
    private int salaryPerDay;
    private int numberOfSubordinates;

    public Manager(String name, int age, String sex, int salaryPerDay, int numberOfSubordinates) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salaryPerDay = salaryPerDay;
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public Manager(Employee employee, int numberOfSubordinates) {
        this.name = employee.name;
        this.age = employee.age;
        this.sex = employee.sex;
        this.salaryPerDay = employee.salaryPerDay;
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public int getSalaryPerDay() {
        return salaryPerDay;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public int getSalary(Month[] monthArray) {
        int salary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            salary += salaryPerDay * monthArray[i].getWorkingDays();
        }
        salary += salary / 100 * numberOfSubordinates;
        return salary;
    }
}
