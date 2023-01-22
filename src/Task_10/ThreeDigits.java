package Task_10;

import java.util.Scanner;

public class ThreeDigits {

    public static void main(String[] args) {

        int x ;
        int y ;
        int z ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение 'X' -");
        x = scanner.nextInt();

        System.out.println("Введите значение 'Y' -");
        y = scanner.nextInt();

        System.out.println("Введите значение 'Z' -");
        z = scanner.nextInt();

        if (x>y && x>z) {
            System.out.println("X наибольшее");
        } else if (y>x && x>z) {
            System.out.println("Y наибольшее");
        } else  {
            System.out.println("Z наибольшее" );
        }
    }
}
