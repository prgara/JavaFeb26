package mar24;

public class PaymentMain {
    public static void main(String[] args) {
        Payment pay = new UPIPayment();

        Payment ccPay = new CreditCardPayment();
        pay.pay();
        pay.notify();
        ccPay.pay();
        System.out.println(Payment.amount);
    }
}
