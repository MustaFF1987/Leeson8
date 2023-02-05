package HomeWork_Lesson3;

import java.util.Scanner;

public class YearTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        int enteryear = scanner.nextInt();

        Year year = new Year();
        System.out.println(year.isLeapYear(enteryear));

    }
}
