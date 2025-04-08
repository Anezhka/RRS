package Homework.Lesson12;

/**
 * Создать неизменяемый (immutable) класс Month с полями: имя месяца, количеством дней
 * и количеством рабочих дней. Поля должны быть спрятаны, для каждого поля создать getter.
 * Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).
 */

public final class Month {

    private final String monthName;
    private final int days;
    private final int workingDays;

    public Month(String monthName, int days, int workingDays) {
        this.monthName = monthName;
        this.days = days;
        this.workingDays = workingDays;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getDays() {
        return days;
    }

    public int getWorkingDays() {
        return workingDays;
    }
}
