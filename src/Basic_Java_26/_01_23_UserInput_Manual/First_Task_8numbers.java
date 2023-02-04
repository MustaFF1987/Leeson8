package Basic_Java_26._01_23_UserInput_Manual;

public class First_Task_8numbers {

    public static void main(String[] args) {

        // создаём новый екзкмпляр класса InputArray
        InputArray inputArray = new InputArray();

        // создаём новый екзкмпляр класса PrintArray
        PrintArray printArray = new PrintArray();

        // создаём новый екзкмпляр класса Array_Operations()
        Array_Operations arrayOperations = new Array_Operations();

        // через экземпдяр класса inputArray взываем метод userInput без аргументов
        // и сохраним результат работы этого метода в локальную переменной workArray
        int[] workArray = inputArray.userInput();


        // через экземпдяр класса printArray взываем метод arrayPrint с аргументами message и createdArray
        printArray.arrayPrint("Ваш созданный массив: ",workArray);

        System.out.println("--------------------------------------------");
        // через экземпдяр класса  arrayOperations взываем метод fromOddtoZero с аргументами
        // печатаем новый массив заменив каждый элемент с нечётным индексом на ноль
        arrayOperations.fromOddtoZero(workArray);

    }
}
