package mar24;

public class NotificationSystem {


    /*
    email -> send email
    sms -> sms notification
    push -> send push notification
    whatsapp ->
     */

    public static void main(String[] args) {
        String type = "email";

        if (type.equals("email")) {
            System.out.println("EMail sent");
        } else if (type.equals("sms")) {
            System.out.println("SMS sent");
        } else if (type.equals("push")) {
            System.out.println("Push notification sent");
        }
    }
}
