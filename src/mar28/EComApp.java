package mar28;

public class EComApp {

    void register() throws EmailNotVerified{
        throw new EmailNotVerified("Email is not verified yet");
//        System.out.println("Email registered");
    }


    void login() throws EmailNotVerified{
        register();
        System.out.println("User logged in");
    }

    void addToCart() throws EmailNotVerified{
        login();
        System.out.println("Items added to the cart");
    }

    void pay() throws EmailNotVerified{
        addToCart();
        System.out.println("Payment done.");
    }
}
