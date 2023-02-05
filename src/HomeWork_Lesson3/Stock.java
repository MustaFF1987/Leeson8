package HomeWork_Lesson3;

public class Stock {

//    Класс Stock должен обладать следующими характеристиками:
//
//    Свойства:
//    - Имя компании
//    - Текущая стоимость
//    - Минимальная стоимость
//    - Максимальная стоимость
//
//    Методы:
//    - Обновить текущую стоимость акции updatePrice(int newPrice)
//    - Получить информацию об акции getPriceInformation()
//
//    Имя компании и начальную стоимость необходимо
//    задавать в момент создания акции.
//    Текущая, минимальная и максимальная стоимость
//    должны меняться только через метод updatePrice().
//
//    Написать тестовые сценарии для класса Stock в классе StockTest.


    public static void main(String[] args) {

        StockTest stock = new StockTest("NFLX",365, 1, 705);

        stock.stockName();
        stock.stockCurrentPrice();
        stock.stockMaxPrice();
        stock.stockMinPrice();

        System.out.println("---------------------------");

        stock.stockName();
        stock.newCurrentPrice(440);
        stock.newMaxPrice(710);
        stock.newMinPrice(5);


        //    Stock google = new Stock("GOOG", 10);
//    String priceInformation = google.getPriceInformation();
//    System.out.println(priceInformation);
//
//        google.updatePrice(15);
//        google.updatePrice(7);
//        google.updatePrice(14);
//
//    priceInformation = google.getPriceInformation();
//    System.out.println(priceInformation);
    }

}
