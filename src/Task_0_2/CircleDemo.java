package Task_0_2;

import java.util.Scanner;
public class CircleDemo {

    public static void main(String[] args) {

        double Radius ;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 'Radius' value - ");

        Radius = scanner.nextDouble();

        Circle circleArea = new Circle();

        double circleAreaResult = circleArea.calculateArea(scanner.nextDouble(), 3.14);

        System.out.println("Площадь круга равна: " + circleAreaResult);

    }
}
