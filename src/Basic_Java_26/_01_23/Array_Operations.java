package Basic_Java_26._01_23;

import java.util.Arrays;

public class Array_Operations {


    // создаём метод, который не будет ничего возвращать и будет проходится -
    // - по массиву и обнулять элементы с нечетным индексом на входе массив workingArray
    public void fromOddtoZero(int[] workingArray) {
        for (int i = 0; i < workingArray.length; i++) {
            if (i % 2 != 0) {
                workingArray[i] = 0;
            }
        }
        System.out.println("New array - " + Arrays.toString(workingArray));
    }
}



