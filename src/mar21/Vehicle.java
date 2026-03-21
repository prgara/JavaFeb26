package mar21;

public class Vehicle {
    int tyres;
    String color;
    int make;
    int avg;


    public Vehicle(int tyres, String color, int make, int avg) {
        this.tyres = tyres;
        this.color = color;
        this.make = make;
        this.avg = avg;
    }

    public Vehicle() {
    }

    void start(){
        System.out.println("Vehicle started");
    }
}
