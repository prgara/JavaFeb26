package mar28;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank(1000);
        System.out.println(bank.showBal());

        bank.deposit(100);
        try{
            bank.withdraw(10000);

        } catch (InsufficientBalance e){
            System.out.println(e.getMessage());
        }
        System.out.println("Current bal : "+bank.balance);
    }
}
