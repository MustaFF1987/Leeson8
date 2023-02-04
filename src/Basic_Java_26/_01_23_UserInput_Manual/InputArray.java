package Basic_Java_26._01_23_UserInput_Manual;

import java.util.Scanner;

public class InputArray {

    public int[] userInput() {

        // вызываем class scanner из библиотеки Java
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 8 случайных целых чисел из интервала [1;50]): ");

        int size = 8;

        // объявляем о создание массива целых чисел с названием createdArray
        // и объявляем его как новый массив целых чисел с размером size
        int[] createdArray = new int[size];

        for (int i = 0; i < createdArray.length; i++) {
            System.out.println("Введите " + i + " массива");
            // обрашаемся к сканнеру и записываем введенное число в массив с соответсвующим индексом
            createdArray[i] = scanner.nextInt();
        }
        // в результатет возвращаем заполненый массив в качестве параметра указываем createdArray
        return createdArray;
    }
}
