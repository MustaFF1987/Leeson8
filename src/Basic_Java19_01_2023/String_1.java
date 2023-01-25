package Basic_Java19_01_2023;


import java.util.Scanner;

public class String_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.print("Напишите первое слово: ");
        String myText1 = scanner.next();
        System.out.print("Напишите второе слово: ");
        String myText2 = scanner.next();

        System.out.println("Первое слово сожержит: " + myText1.length() + " букв");
        System.out.println("Второе слово сожержит: " + myText2.length() +" букв");

        String subString1 = myText1.substring(0,4);
        String subString2 = myText2.substring(4);
        System.out.println("Слово MIX: " + subString1 + subString2);




    }
}
