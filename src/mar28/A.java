package mar28;

public interface A {

    void show();
}



abstract class B{
   static int a;

    public B(int a) {
        this.a = a;
    }

    void show(){
        System.out.println("Concrete method from abs class ");
    }
}


class C extends B implements A{

    int b;

    public C(int b) {
        super(5);
        this.b = b;
    }

    public void show() {
        System.out.println("Abstract method from interface");
    }

    public static void main(String[] args) {
        C c = new C(5);
        c.show();
    }


}
