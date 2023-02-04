package Basic_Java_26._01_23_InputAuto;

public class RandomArray {

    public static void main(String[] args) {

        // создаём новый объек сласса ArrayUtil
        ArrayUtil arrayUtil = new ArrayUtil();

        // создаём переменные типа int и инициализируем их значения в соответсвии с услловиями задачи
        // (Создайте массив из 8 случайных целых чисел из интервала [1;50])
        int arraySize = 10;
        int arrayRange = 50;

        // создаём массивиз целых чисел называем его  workingArray присваеваем ему значение через объект класса arrayUtil
        // и обращаемся методу createArray(arraySize)
        int [] workingArray = arrayUtil.createArray(arraySize);

        // через объект класса arrayUtil обращаемся к методу createRandomDigitsArray и указываем аргументы)
         arrayUtil.createRandomDigitsArray(workingArray, arrayRange);
        // через объект класса arrayUtil обращаемся к методу printArray
        arrayUtil.printArray("Ваш созданный рандомный массив: ", workingArray);

        // создаём массивиз целых чисел называем его oddTozeroArray присваеваем ему значение через объект класса arrayUtil
        // и обращаемся методу arrayOddIndextoZero(workingArray)
        int [] oddTozeroArray = arrayUtil.arrayOddIndextoZero(workingArray);

        // через объект класса arrayUtil обращаемся к методу printArray и указываем аргументы)
        arrayUtil.printArray("Новый массив с заменёнными числами: ", oddTozeroArray);
    }
}
