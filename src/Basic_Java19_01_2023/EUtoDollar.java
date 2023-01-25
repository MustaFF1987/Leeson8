package Basic_Java19_01_2023;

import java.util.Scanner;

public class EUtoDollar {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму в € : ");
        double summIneuro = scanner.nextDouble();
        System.out.println("Ваша сумма в долларах будер равна : " + calculator.euTOdollar(summIneuro) + " $");
    }
}
