package mar21;

public class SavingAccount extends Bank {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.setBal(-5000);
        System.out.println(savingAccount.getBal());
    }
}
