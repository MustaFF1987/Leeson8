package Basic_Java_26._01_23_2;

import java.util.Arrays;

public class MissingNumber {
    public static int getMissingNumber(int[] arr)
    {
        // создаём переменную n типа Integer и записываем туда получаем длинну массива
        int n = arr.length;
        // создаём переменную m типа Integer и записываем туда фактический размер `n+1`, так как в массиве отсутствует число
        int m = n + 1;
        // создаём переменную total типа Integer и записываем туда сумму целых чисел от 1 до `n+1`
        int total = m * (m + 1) / 2;
        // создаём переменную sum типа Integer и записываем туда фактическую сумму целых чисел в массиве
        int sum = Arrays.stream(arr).sum();
        // возвращаем пропущенное число - это разница между ожидаемой суммой и фактическая сумма
        return total - sum;
    }

    public static void main(String[] args)
    {
        // создаём новый екзкмпляр класса InputArray
        InputArray inputArray = new InputArray();

        // через экземпдяр класса inputArray взываем метод userInput без аргументов
        // и сохраним результат работы этого метода в локальную переменной workArray
        int[] workArray = inputArray.userInput();

        // создаём новый екзкмпляр класса PrintArray
        PrintArray printArray = new PrintArray();

        System.out.println("------------------------------");

        // через экземпдяр класса printArray взываем метод arrayPrint с аргументами message
        printArray.arrayPrint("Пропущенное число в массиве " + getMissingNumber(workArray));
    }
}


