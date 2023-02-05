package HomeWork_Lesson3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число");
            int firstDigit = scanner.nextInt();
            System.out.println("Введите второе число");
            int secondDigit = scanner.nextInt();
            System.out.println("Введите третье число");
            int ThirdDigit = scanner.nextInt();

        CalculatorUtil calculatorUtil  = new CalculatorUtil();


        System.out.println("Является ли первое число четным");
        System.out.println(calculatorUtil.isEven(firstDigit));

        System.out.println("Первое число больше второго");
        System.out.println(calculatorUtil.firstBiggerThanSecond(firstDigit, secondDigit));

        System.out.println("Второе число больше первого");
        System.out.println(calculatorUtil.secondBiggerThanFirst(firstDigit, secondDigit));

        System.out.println("Оба числа равны");
        System.out.println(calculatorUtil.twoNumbersAreEqual(firstDigit, secondDigit));

        System.out.println("Прогрессия чисел -  ");
        System.out.println(calculatorUtil.numbersOrder(firstDigit, secondDigit, ThirdDigit));

    }
}
