package mar21;

public class LoginMain {
    public static void main(String[] args) {
        Login login = new Login("Mayur","Mayur");
        login.setPassword("12345");
        login.loginUser("Mayur","12345");
    }
}
