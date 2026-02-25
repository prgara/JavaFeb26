package feb21;

public class WhileLoop {

    public static void main(String[] args) {
        int x = 10;  // initialization is always outside
        while (x >= 0){ // condition is withing the while loop -1>=0
            System.out.println(x); // stmt
            x--;  // increment or decrement inside the block
        }
    }
}
