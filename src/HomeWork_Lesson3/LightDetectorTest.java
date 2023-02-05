package HomeWork_Lesson3;

public class LightDetectorTest {

    public static void main(String[] args) {

        LightDetector lightDetector = new LightDetector();

        //        380 ... 449 - Фиолетовый ("Violet")
        //        450 ... 494 - Синий ("Blue")
        //        495 ... 569 - Зеленый ("Green")
        //        570 ... 589 - Желтый ("Yellow")
        //        590 ... 619 - Оранжевый ("Orange")
        //        620 ... 750 - Красный ("Red")

        System.out.println("------------------------------");
        System.out.println(lightDetector.lightDetector("Диапазон"));
    }
}
