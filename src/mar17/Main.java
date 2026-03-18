package mar17;

public class Main {

    public static void main(String[] args) {
        String a = "Pragra"; // string literal
        String b = "Pragra";
        String c = "prgara";
        String d = new String("Pragra");
        String concated = a.concat("Missisuaga");
        System.out.println(a);
        System.out.println(concated);
        char[] charArray = a.toCharArray();
        for(char ele: charArray){
            System.out.println(ele);
        }

        System.out.println(a==b); // True
        System.out.println(a==c); // False
        System.out.println(a==d); // True, false
        System.out.println(c==d); // False

        System.out.println(a.equals(b)); // true
        System.out.println(a.equals(d)); // false




    }
}
