package mar21;

public class Bike extends Vehicle{

    void kickStart(){
        super.start();
        System.out.println("Bike kick started");
    }
}
