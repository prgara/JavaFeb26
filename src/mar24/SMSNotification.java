package mar24;

public class SMSNotification extends Notification{

    public SMSNotification(String name) {
        super(name);
    }

    @Override
    void send() {
        System.out.println("Sending sms notification");
    }


}
