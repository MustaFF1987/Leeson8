package Basic_Java_26._01_23_1_UserInput_Manual;

public class Second_Task_5numbers {
    public static void main(String[] args) {

        int arraySize = 5;

        int arrayRangeStart = 10;
        int arrayRangeEnd = 99;

        // создаём новый екзкмпляр класса InputArray
        InputArray2 input2Array = new InputArray2();
        // создаём новый екзкмпляр класса PrintArray

        // создаём новый екзкмпляр класса Array_Operations()
        Array_Operations2 array2operations = new Array_Operations2();

        // через экземпдяр класса inputArray взываем метод userInput без аргументов
        // и сохраним результат работы этого метода в локальную переменной workArray
        int[] workArray = input2Array.userInput2();

        // через экземпдяр класса  array2Operations взываем метод ascendentArray с аргументом workArray
        // и он печатает резултат раьоты является ли массив возрастающий или убывающий
        array2operations.ascendentArray(workArray);
    }
}
