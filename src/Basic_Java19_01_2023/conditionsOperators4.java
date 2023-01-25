package Basic_Java19_01_2023;

import java.util.Scanner;

public class conditionsOperators4 {

    public static void main(String[] args) {

  Calculator calculator = new Calculator();

        System.out.println(" Введите целое число из диапазона от 0 до 28800, сколько секунд вы отработали    : ");
        Scanner scanner  = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int totalWorkTimeInHours = 9;
        int totalWorkTimeInSeconds = 32400;

      System.out.println("До конца рабочего дня осталосьх: " + (totalWorkTimeInSeconds - seconds) + " секунд");

      System.out.println("До конца рабочего дня осталось: " + (totalWorkTimeInHours - calculator.secondsTohours(seconds)) + " часа/ов");

    }
}

