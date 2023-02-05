package HomeWork_Lesson3;

import java.util.Scanner;

public class FizzBuzzTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите число: ");
        int userNumber = scanner.nextInt();

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.detect(userNumber);

    }
}
