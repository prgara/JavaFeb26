package mar10;

public class Count {

  static int counter = 10;

    Count(){
        System.out.println(counter);
        counter++;
    }


   static void display(){
        System.out.println("Counter value at the end is : " + counter);
    }


    void display1(){
        System.out.println("Counter value at the end is : " + counter);
    }

    {
        System.out.println("Executing the instance block");
    }


    static {
        // db connection
        System.out.println("Executing the static block");
    }

    //

}
