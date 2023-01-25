package Basic_Java19_01_2023;


import java.util.Scanner;

public class String_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String myText1 = scanner.next();
        String myText2 = scanner.next();

        System.out.println(myText1);
        System.out.println("Сожержит: " + myText1.length() + " букв" );
        System.out.println(myText2);
        System.out.println("Сожержит: " + myText2.length() +" букв");

        String subString1 = myText1.substring(0,4);
        String subString2 = myText2.substring(4);
        System.out.println("Слово MIX: " + subString1 + subString2);




    }
}
