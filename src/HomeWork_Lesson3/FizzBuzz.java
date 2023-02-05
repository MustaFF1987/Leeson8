package HomeWork_Lesson3;

public class FizzBuzz {
            // public String detect(int number) {
            // Реализуйте следующие требования:
            // - если переданное число делится на три возвращайте "Fizz"
            // - если переданное число делится на пять возвращайте "Buzz"
            // - если переданное число делится на три и на пять возвращайте "FizzBuzz"
            // - иначе возвращайте само число в виде строки (подсказка: return "" +  number)

    public String detect(int number){
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
            return "FizzBuzz";
        }
        else if (number % 5 == 0) {
            System.out.println("Buzz");
            return "Buzz";
        }
          else if (number % 3 == 0){
            System.out.println("Fizz");
                return "Fizz";
            }
          else {
            System.out.println("Ваше число: " + number);
            return Integer.toString(number);
        }
    }
}
