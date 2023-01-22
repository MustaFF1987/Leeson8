package Task_5;

import java.util.Scanner;
public class Two_Digits {

    public static void main(String[] args) {

        int x ;
        int y ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение 'X' -");
        x = scanner.nextInt();

        System.out.println("Введите значение 'Y' -");
        y = scanner.nextInt();

        if (x>y) {
            System.out.println("X больше Y и равен " + x);
        } if (x<y){
            System.out.println("Y больше X и равен " + y);
        }

    }
}
