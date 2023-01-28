package Basic_Java_26._01_23_1;

public class Second_Task_5numbers {
    public static void main(String[] args) {

      // создаём новый екзкмпляр класса InputArray
        InputArray2 input2Array = new InputArray2();
      // создаём новый екзкмпляр класса PrintArray
       PrintArray2 print2Array = new PrintArray2();

        // создаём новый екзкмпляр класса Array_Operations()
       Array_Operations2 array2operations = new Array_Operations2();

      // через экземпдяр класса inputArray взываем метод userInput без аргументов
       // и сохраним результат работы этого метода в локальную переменной workArray
       int[] workArray = input2Array.userInput2();
       // через экземпдяр класса printArray взываем метод arrayPrint с аргументами message и createdArray
       print2Array.arrayPrint("Ваш созданный массив: ",workArray);

      array2operations.ascendentArray(workArray);
    }
}
