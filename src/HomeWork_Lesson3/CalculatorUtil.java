package HomeWork_Lesson3;

public class CalculatorUtil {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int firstBiggerThanSecond(int FirstDigit, int secondDigit) {
        int result = 0;
        boolean condition = true;

        if (FirstDigit > secondDigit)
            System.out.println(condition);
        else {
            System.out.println(!condition);
        }
        return result;
    }

    public int secondBiggerThanFirst(int FirstDigit, int secondDigit) {
        int result = 0;
        boolean condition = true;

        if (FirstDigit < secondDigit)
            System.out.println(condition);
        else {
            System.out.println(!condition);
        }
        return result;
    }

    public int twoNumbersAreEqual(int FirstDigit, int secondDigit) {
        int result = 0;
        boolean condition = true;

        if (FirstDigit == secondDigit)
            System.out.println(condition);
        else {
            System.out.println(!condition);
        }
        return result;
    }

    public int numbersOrder(int firstDigit, int secondDigit, int thirdDigit) {

        int result = 0;

        if (firstDigit == secondDigit || secondDigit == thirdDigit)
            System.out.println("Числа равны!");
        if  (firstDigit < secondDigit || secondDigit < thirdDigit)
            System.out.println("Возрастающая!");
        if (firstDigit > secondDigit || secondDigit > thirdDigit)
            System.out.println("Убывающая!");

        return result;
    }




}



