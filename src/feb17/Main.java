package feb17;

public class Main {

    public static void main(String[] args) {

        int z = 10;
         z +=5; // z = z+5
        System.out.println(z);


        byte b = 10;
        b +=5; // converting this statement to int internally
        int c  = b+5;
        System.out.println(b);

        int f = 5;
        f += 3*2;
        System.out.println(f);

        int h = 10;
        h = h++ + ++h;
        System.out.println(h);


    }

}

