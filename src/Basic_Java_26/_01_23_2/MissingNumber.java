package Basic_Java_26._01_23_2;

import static Basic_Java_26._01_23_2.OperationArrays.getMissingNumber;

public class MissingNumber {

    public static void main(String[] args)
    {
        OperationArrays operationArray = new OperationArrays();
        // создаём новый екзкмпляр класса InputArray
        InputArray inputArray = new InputArray();

        // через экземпдяр класса inputArray взываем метод userInput без аргументов
        // и сохраним результат работы этого метода в локальную переменной workArray
        int[] workArray = inputArray.userInput();

        // создаём новый екзкмпляр класса PrintArray
        PrintArray printArray = new PrintArray();
        System.out.println("------------------------------");

        OperationArrays.getMissingNumber(workArray);

        // через экземпдяр класса printArray взываем метод arrayPrint с аргументами
        printArray.arrayPrint("Пропущенное число в массиве " + getMissingNumber(workArray));
    }
}


