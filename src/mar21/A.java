package mar21;

public class A {
    int x ;
    public A() {
        System.out.println("class A");
    }

    public A(int x) {
        this.x = x;
    }
    void show(){
        System.out.println(x);
    }
}

class B extends A{
    public B(int a ) {
        this();
//        super(a);
        System.out.println("Class b");
    }

    public B() {
    }
}

class C extends B{
    public C(int a ) {
        super();
        System.out.println("class C");
    }
}

class Main{
    public static void main(String[] args) {
        C c = new C(10);
        B b = new B(10);
        b.show();
    }
}
