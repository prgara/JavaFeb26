package mar24;

import javax.management.Notification;

public class CreditCardPayment extends UPIPayment implements Payment {


    @Override
    public void pay() {
        System.out.println("Paying using credit card");
    }
}
