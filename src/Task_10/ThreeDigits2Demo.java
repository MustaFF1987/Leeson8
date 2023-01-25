package Task_10;

public class ThreeDigits2Demo {

    public static void main(String[] args) {

        ThreeDigits2 numbersCompare = new ThreeDigits2();

        double value1 = numbersCompare.inputUser("Please enter your first number ");
        double value2 = numbersCompare.inputUser("Please enter your second number ");
        double value3 = numbersCompare.inputUser("Please enter your third number ");

        double result = numbersCompare.compare(value1, value2, value3);

        numbersCompare.printMsg("Your biggest number is " + result);

    }
}

