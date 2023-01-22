package Task_6;

import java.util.Scanner;

public class SmallerDigit {
    public static void main(String[] args) {

        int x ;
        int y ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение 'X' -");
        x = scanner.nextInt();

        System.out.println("Введите значение 'Y' -");
        y = scanner.nextInt();

        if (x<y) {
            System.out.println("X меньше Y и равен " + x);
        } if (x>y){
            System.out.println("Y меньше X и равен " + y);
        }

    }
}
