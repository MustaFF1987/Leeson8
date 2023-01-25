package Basic_Java19_01_2023;

import java.util.Scanner;

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner scanner  = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double firstDigit = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double secondDigit = scanner.nextDouble();

        System.out.println("----------------------");

        System.out.println("Сумма двух чисел: " + calculator.sum(firstDigit, secondDigit));
        System.out.println("----------------------");
        System.out.println("Разница двух чисел: " + calculator.sub(firstDigit, secondDigit));
        System.out.println("----------------------");
        System.out.println("Умножение двух чисел: " + calculator.mult(firstDigit, secondDigit));
        System.out.println("----------------------");
        System.out.println("Деление двух чисел: " + calculator.div(firstDigit, secondDigit));
    }
}
