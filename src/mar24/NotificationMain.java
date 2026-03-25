package mar24;

public class NotificationMain {
    public static void main(String[] args) {
        Notification notification = new SMSNotification("Send");
        notification.send();
        notification.log();
    }
}
