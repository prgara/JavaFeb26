package feb17;

public class LogicalOperators {

    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        int c = 89;
        int d = 10;
        int e = 189;
        int f = 879;

        System.out.println(a > b && a> b);       //  False
        System.out.println(c <= b || d >= a);    //  True
        System.out.println(f != b && a > b);     //  False
        System.out.println(a < b || a> b);       //  True
        System.out.println(!(e <= b) != !(a > b)); //False true != true
        System.out.println(d <= b || a== f);       //True
        System.out.println(f <= f && a != b);      //True
        System.out.println(e < e && e >= f);       //False
        System.out.println(a > e && e++ < f);       //False

    }
}
