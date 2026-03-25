package mar24;

public class UPIPayment implements Payment, Notify{

    String money;
    @Override
    public void pay() {
        System.out.println("Paying using UPI method");
    }

    @Override
    public void notifyUser() {
        System.out.println("User Notified");
    }
}
