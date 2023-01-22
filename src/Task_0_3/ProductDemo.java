package Task_0_3;

import java.util.Scanner;

public class ProductDemo {

    public static void main(String[] args) {

        double productPrice;

        double discount;

        String productName = "Samsung Galaxy S22";

        System.out.println("Вы выбрали проудкт: " + productName);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Какую сумму вы заплатили за продукт в €: ");

        productPrice = scanner.nextDouble();

        System.out.println("Сколько процентов скидку вы получили: ");

        discount = scanner.nextDouble();

        Product product1 = new Product("M", 1, 1);

        double discountedProduct = product1.getDiscount(productPrice, discount);

        System.out.println("Сумма товара со скидкой будет " + discountedProduct + " €");
    }
}
