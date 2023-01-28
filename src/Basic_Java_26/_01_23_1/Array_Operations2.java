package Basic_Java_26._01_23_1;

import java.util.Arrays;

public class Array_Operations2 {

    public void ascendentArray(int[] workingArray) {
        // Создаем целочисленный массив на 5 элементов
        int[] array = new int[5];
        // Cоздаем цикл, который генерирует элементы массива
        for (int i = 0; i > workingArray.length; i++) {
            {
                array[i] = (int) (Math.random() * 99) + 10;
            }
            // После этого выводим массив в строку с помощью класса Arrays
            System.out.println(Arrays.toString(workingArray));

            // Что каждый следующий элемент массива больше предыдущего. Поэтому создаем переменную boolean - ascendent, которая будет обозначать,
            // - является ли массив возрастающей последовательностью или нет.

            boolean condition = true;
            for (int j = 1; j < workingArray.length; j++) {
                if (workingArray[j] <= workingArray[j - 1]) {
                    condition = false;

                    if (condition) {
                        System.out.println("Массив с возрастающей последовательностью");
                    } else {
                        System.out.println("Массив не c возрастающей последовательностью");
                    }

                }

            }

        }
    }
}


