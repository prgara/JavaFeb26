package mar24;

public class EmailNotification extends Notification{

    // Each class hides its own complexity
    @Override
    void send() {
        System.out.println("Sending email notification");
    }

    public EmailNotification(String name) {
        super(name);
    }
}
