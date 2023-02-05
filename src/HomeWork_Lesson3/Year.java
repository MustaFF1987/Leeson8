package HomeWork_Lesson3;

public class Year {

    // return true - если год високосный
    // return false - если год обычный
    // public boolean isLeapYear(int year) {
    // Если год не делится на 4, значит он обычный.
    // Иначе надо проверить не делится ли год на 100.
    // Если не делится, значит это не столетие и можно сделать вывод, что год високосный.
    // Если делится на 100, значит это столетие и его следует проверить его делимость на 400.
    // Если год делится на 400, то он високосный.
    // Иначе год обычный.

    public boolean isLeapYear(int year) {
        if (year % 4 != 0 && year % 100 != 0 && year % 400 != 0) {
            System.out.println("Невысокосный");
            return false;
        }
        else {
            System.out.println("Высокосный");
            return true;
        }
    }
}
