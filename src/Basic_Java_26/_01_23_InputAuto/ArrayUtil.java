package Basic_Java_26._01_23_InputAuto;

import org.w3c.dom.ls.LSOutput;

public class ArrayUtil {

    // 1. Создаем метод который будет создавать массив
    public int[] createArray(int arraySize) {

        return new int[arraySize];
    }

    // 2. создаём метод который будет создавать массив из рандомных чисел
    public void createRandomDigitsArray(int[] workingArray, int arrayRange){
        for (int i = 0; i <workingArray.length ; i++) {
            workingArray[i] = (int) (Math.random() * arrayRange);
        }
    }

    // 3. создаём метод который будет печатать созданный массив
    public void printArray(String message, int[] workingArray) {
        System.out.println(message);

        int count = 0;

        for (int i = 0; i < workingArray.length; i++) {
            System.out.print(workingArray[i] + " ");
        }
        System.out.println();
    }

    // 4. создаём метод который будет искать нечетный идекс элемента массива и менять его на 0
    public int[] arrayOddIndextoZero (int[] workingArray){
        int[] newArray = new int[workingArray.length];
        for (int i = 0; i < newArray.length; i++) {
            if (i % 2 != 0) {
                newArray[i] = 0;
            } else {
                newArray[i] = workingArray[i];
            }
        }
            return newArray;

    }
}
