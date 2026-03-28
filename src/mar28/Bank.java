package mar28;

public class Bank {

    int balance;

    public Bank(int balance) {
        this.balance = balance;
    }

    int showBal() {
        return balance;
    }


    void deposit(int amount){
        balance = balance + amount;
    }


    void withdraw(int amount){
        if(amount > balance){
            throw new InsufficientBalance("Balance is less than amount : " + amount);
        }
        balance -= amount;
    }
}
