package feb28;

public class Main {

    public static void main(String[] args) {

//        Class(non-primitive)       reference                 reserve memeoy for object
        Car                            car       =               new Car();
        Car honda = new Car();
        Car hyndai = new Car();
        Car kia = new Car();
        Car tesla = new Car();
        Car ford = new Car();

        car.color= "Red";
        car.model=2026;
        car.type="SUV";
        car.trim = "Luxury";

        car.start();
        car.carBrake();


        car.numOfDoors(4,"white");
        ford.numOfDoors(2,"red");
        tesla.numOfDoors(2,"black");
//
//
        Calculator cal = new Calculator();
        int add = cal.add(2, 4);
        System.out.println(add);
        cal.display(3);

    }
}
