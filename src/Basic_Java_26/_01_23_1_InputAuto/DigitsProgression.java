package Basic_Java_26._01_23_1_InputAuto;

public class DigitsProgression {
    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();

        int arraySize = 5;

        int arrayRangeStart = 10;
        int arrayRangeEnd = 99;

        int[] workingArray = arrayUtil.createArray(arraySize);
        arrayUtil.fillArrayByRandomElements(workingArray,arrayRangeStart,arrayRangeEnd);

        arrayUtil.printArray("Ваш созданный массив: ", workingArray);

        if (arrayUtil.increasingProgression(workingArray)) {
            System.out.println("Массив с возрастаюзей прогрессией");
        } else {
            System.out.println("Массив с убывающей прогрессией");
        }

    }
}
