package Task_0_3;

public class Product {

    String name;
    double regularPrice;
    double discount;

    public Product(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    public double getDiscount(double regularPrice, double discount){
        double discountedPrice = regularPrice - (regularPrice * discount /100);
        return discountedPrice;
    }

}
