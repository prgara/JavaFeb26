package feb28;

public class Car {

    String color;
    String type;
    int model;
    String trim;


    void start(){
        System.out.println("Car started");
    }

    void carBrake(){
        System.out.println("Car stopped");
    }


    void numOfDoors(int doors,String color){
        System.out.println("Car has " +  doors + " doors of " + color + "color" );
    }


}
