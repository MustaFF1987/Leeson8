package Task_8;

import java.util.Scanner;

public class ThreeDigits {

    public static void main(String[] args) {

        int x;
        int y;
        int z;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение 'X' -");
        x = scanner.nextInt();

        System.out.println("Введите значение 'Y' -");
        y = scanner.nextInt();

        System.out.println("Введите значение 'Z' -");
        z = scanner.nextInt();

        if (x==y && y==z) {
            System.out.println("All numbers are equal");
        } else if (x!=y && y!=z && z!=x) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different" );
        }

    }
}




