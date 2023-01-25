package Basic_Java19_01_2023;

import java.util.Scanner;

public class conditionsOperators2 {

    public static void main(String[] args) {

        boolean isEdekaOpen   ;
        boolean isReweOpen;
        boolean canBuy = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите true или false");
        isEdekaOpen = scanner.nextBoolean();
        System.out.println("Напишите true или false");
        isReweOpen = scanner.nextBoolean();

        if (isEdekaOpen && isReweOpen) {
            System.out.println("Я могу купить еду, это " + canBuy);
        } else {
            System.out.println("Не могу купить ничего");
        }

    }
}
