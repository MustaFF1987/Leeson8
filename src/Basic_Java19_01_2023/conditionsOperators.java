package Basic_Java19_01_2023;

public class conditionsOperators {

    public static void main(String[] args) {

        boolean canWalk = true;
        boolean isRain = true;
        boolean isWeekend = true;

        if ( !isRain || isWeekend) {
            System.out.println(canWalk);
        } else {
            System.out.println("False");
        }

    }

}
