package mar17;

public class MutableString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        StringBuilder sbd = new StringBuilder("Hello World");
        String s = "Hello World";
//        System.out.println(s.concat(" To java"));
        sb.append(" To Java");sbd.append("kdwhuhfiu");
//        System.out.println(sb);
//        System.out.println(s);

        // to append a num from 1 to 100 in a string
        for (int i = 1; i < 100; i++) {
            s = s.concat(String.valueOf(i));
            System.out.println(s);
        }
    }
}
