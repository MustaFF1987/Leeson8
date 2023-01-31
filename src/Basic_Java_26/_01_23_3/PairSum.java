package Basic_Java_26._01_23_3;

import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {

        ArrayOperations arrayOperations = new ArrayOperations();

        Scanner scanner = new Scanner(System.in);
        InputArray inputArray = new InputArray();
        PrintArray printArray = new PrintArray();
        int[] workArray = inputArray.userInput();
        System.out.println("Введите сумму чисел для поиска кол-ва пар в массиве: ");
        int k = scanner.nextInt();
        printArray.arrayPrint("Число пар в вашем масиве:  " + arrayOperations.countPairs(workArray, k));
    }
}
