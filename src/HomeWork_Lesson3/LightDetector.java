package HomeWork_Lesson3;

import java.util.Scanner;

public class LightDetector {

    //        Функциональные требования:
    //        Программа должна определять цвет в зависимости
    //        от длины волны в соответствии со следующими правилами:
    //        380 ... 449 - Фиолетовый ("Violet")
    //        450 ... 494 - Синий ("Blue")
    //        495 ... 569 - Зеленый ("Green")
    //        570 ... 589 - Желтый ("Yellow")
    //        590 ... 619 - Оранжевый ("Orange")
    //        620 ... 750 - Красный ("Red")
    //        Вне диапазонов - невидимый спектр ("Invisible Light")

    public String lightDetector(String massage) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое значение диапазона: ");
        int firstRange = scanner.nextInt();
        System.out.println("Введите второе значение диапазона: ");
        int secondRange = scanner.nextInt();
        String message = "";

        if (firstRange >= 380 && secondRange <= 449)
            System.out.println("Диапазон цвета: Фиолетовый");
        else if (firstRange >= 450 && secondRange <= 494) {
            System.out.println("Диапазон цвета: Синий");
        } else if (firstRange >= 495 && secondRange <= 569) {
            System.out.println("Диапазон цвета: Зелёный");
        } else if (firstRange >= 570 && secondRange <= 589) {
            System.out.println("Диапазон цвета: Желтый");
        } else if(firstRange >= 590 && secondRange <= 619) {
            System.out.println("Диапазон цвета: Оранжевый");
        } else if (firstRange >= 620 && secondRange <= 750) {
            System.out.println("Диапазон цвета: Красный");
        } else {
            System.out.println("Цвет вне диапазона!");
        }
        return message;
    }
}






