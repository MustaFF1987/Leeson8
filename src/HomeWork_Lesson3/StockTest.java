package HomeWork_Lesson3;

public class StockTest {

    String stockName;
    int stockCurrentPrice;
    int stockMinPrice;
    int stockMaxPrice;

    StockTest (String stockName, int stockCurrentPrice, int stockMinPrice, int stockMaxPrice) {
        this.stockName = stockName;
        this.stockCurrentPrice = stockCurrentPrice;
        this.stockMinPrice = stockMinPrice;
        this.stockMaxPrice = stockMaxPrice;
    }

        String getstockName() {
            return this.stockName;
        }
        Integer getstockCurrentPrice() {
            return this.stockCurrentPrice;
        }
        Integer getstockMinPrice() {
            return this.stockMinPrice;
        }
        Integer getStockMaxPrice() {
            return this.stockMaxPrice;
        }
        void stockName(){
        System.out.println("Stock name: " + this.stockName);
        }
        void stockCurrentPrice(){
        System.out.println("Stock current price: " + this.stockCurrentPrice);
        }
        void stockMinPrice(){
            System.out.println("Stock minimal price: " + this.stockMinPrice);
        }
        void stockMaxPrice() {
            System.out.println("Stock maximal price: " + this.stockMaxPrice);
        }

    int newMaxPrice = 0;
    int newMinPrice = 0;
    int newCurrentPrice = 0;
        void newMaxPrice (int newMaxPrice){
            System.out.println("Stock new maximal price: " + newMaxPrice);
        }

        void newMinPrice(int newMinPrice){
            System.out.println("Stock new minimal price: " + newMinPrice);
        }

        void newCurrentPrice(int newCurrentPrice){
        System.out.println("Stock new minimal price: " + newCurrentPrice);
        }

}

