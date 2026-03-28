package mar28;

public class EComMain {

    public static void main(String[] args)  {
        EComApp ecom = new EComApp();
        try {
            ecom.pay();
        } catch (EmailNotVerified e) {
            System.out.println(e.getMessage());
        }
    }
}
