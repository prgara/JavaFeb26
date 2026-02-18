package feb17;

public class DecisionMaking {

    public static void main(String[] args) {

      boolean isRaining = true;
      boolean isSunny = false;


      if(isRaining){
          if(true){
              System.out.println("Nested if executed");
          }
          System.out.println("I will carry umbrella...");
      } else if (isSunny) {
          System.out.println("I will put sunglasses");
      } else {
          System.out.println("I will do nothing");
      }
    }
}
