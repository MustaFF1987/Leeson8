package Task_0_5;

public class ComputerDemo {

    public static void main(String[] args) {

        Computer dell = new Computer("Dell", "XXX-1");
        String manufacturer = dell.manufacturer;
        String model = dell.model;
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);

    }
}
