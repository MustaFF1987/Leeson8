package Basic_Java_26._01_23_2;

import java.util.Arrays;

public class OperationArrays {
    public static int getMissingNumber(int[] arr) {
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
}
