package Basic_Java19_01_2023;

import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner  = new Scanner(System.in);
        System.out.println("В пицце 24см : 18килокалорий (18000 калорий)");
        System.out.print("Введите диаметр съеденной пиццы: ");
        double firstPizzaArea = scanner.nextDouble();


        System.out.println("Количество калорий в вашей пицце: " + (calculator.circleArea(firstPizzaArea) * 40));
        System.out.println("Вы съедите на: " + ((calculator.circleArea(firstPizzaArea) * 40) - 18000) + " калорий больше");
    }
}
