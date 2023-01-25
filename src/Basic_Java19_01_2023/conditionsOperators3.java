package Basic_Java19_01_2023;

import java.util.Scanner;

public class conditionsOperators3 {
    public static void main(String[] args) {

        double temperature1;
        double temperature2;
        boolean workingProperly = true;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Задайте температуру 1ой колбе: ");
        temperature1 = scanner.nextDouble();
        System.out.print("Задайте температуру 2ой колбе: ");
        temperature2 = scanner.nextDouble();

        if (temperature1 > 100 && temperature2 < 100) {
            System.out.println("Устройство работает: = " + workingProperly);
        } else {
            System.out.println("Устройство не работает: = " + !workingProperly);
        }
    }
}