package Basic_Java_26._01_23_1;

import java.util.Scanner;

public class InputArray2 {

    public int[] userInput2() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 случайных чисел из интервала [10;99]): ");
        int size = 5;

        // объявляем о создание массива целых чисел с названием createdArray
        // и объявляем его как новый массив целых чисел с размером size
        int[] createdArray = new int[5];

        for (int i = 0; i < createdArray.length; i++) {
            System.out.println("Введите " + i + " индекс массива");
            // обрашаемся к сканнеру и записываем введенное число в массив с соответсвующим индексом
            createdArray[i] = scanner.nextInt();
        }
        // в результатет возвращаем заполненый массив в качестве параметра указываем reatedArray
        return createdArray;
    }
}
