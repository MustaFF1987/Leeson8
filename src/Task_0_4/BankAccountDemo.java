package Task_0_4;

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Viktor", 100000);

        String ownerFirstName = bankAccount.owner;
        Integer moneyAmount = bankAccount.money;

        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);

    }
}
