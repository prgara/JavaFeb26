package mar21;

public class Login {

   protected String userName;
   protected String password;

    public Login(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Login() {
    }

    void loginUser(String name, String password){
        if(this.userName.equals(name) && this.password.equals(password)){
            System.out.println("user logged in succesfully");
        } else {
            System.out.println("Incorrect credentials");
        }
    }

    protected String getUserName() {
        return userName;
    }


    public void setPassword(String password) {
        this.password = password;
    }
}
