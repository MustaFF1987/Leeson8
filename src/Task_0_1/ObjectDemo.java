package Task_0_1;

public class ObjectDemo {

    public static void main(String[] args) {

        Object object1 = new Object("Yoga 720","Lenovo",3, "Intel core i5");

        object1.Model = "Yoga 720";
        object1.Brand = "Lenovo";
        object1.weight = 3;
        object1.processor = "Intel core i5";

        System.out.println("Model: " + object1.Model);
        System.out.println("Brand: " + object1.Brand);
        System.out.println("Weight: " + object1.weight + "kg");
        System.out.println("Processor: " + object1.processor);

        System.out.println("-------------------------------------");

        Object object2 = new Object ("Inspiron","Dell",2, "Intel core i7");

        object2.Brand = "Dell";
        object2.Model = "Inspiron";
        object2.weight = 2;
        object2.processor = "Intel core i7";

        System.out.println("Model: " + object2.Model);
        System.out.println("Brand: " + object2.Brand);
        System.out.println("Weight: " + object2.weight + "kg");
        System.out.println("Processor: " + object2.processor);
    }


}
