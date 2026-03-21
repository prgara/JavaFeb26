package mar21;

public class Bank {

  public int bal =1000;


    void showBal(){
        System.out.println(bal);
    }

     int getBal(){
        return bal;
    }

    void setBal(int bal) {
        if (bal > 0) {
            this.bal = bal;
        }
    }



}





