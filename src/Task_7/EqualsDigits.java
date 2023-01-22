package Task_7;

import java.util.Scanner;

public class EqualsDigits {

    public static void main(String[] args) {

        int x;
        int y;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение 'X' -");
        x = scanner.nextInt();

        System.out.println("Введите значение 'Y' -");
        y = scanner.nextInt();

        if (x == y) {

            System.out.println("Числа равны");

        }
        if (x > y || x < y) {
            System.out.println("Числа не равны");
        }
    }
}
