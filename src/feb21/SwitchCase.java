package feb21;

public class SwitchCase {

    public static void main(String[] args) {

        String day = "Tuesday";
        switch (day) {
            case "Monday": //true
                System.out.println("Today is Sunday");
                break;
            case "Sunday": //true
                System.out.println("Today is Monday");
                break;
        }



        switch (day){  //jaav 14
            case "Thursday" -> System.out.println("Today is thursday");
            case "Tuesday" -> System.out.println("Today is tuesday");
            case "Monday" -> System.out.println("Today is monday");
        }

    }
}
