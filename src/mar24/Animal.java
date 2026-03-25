package mar24;

public class Animal {

    private String name;

   static void sound(){
        System.out.println("Animal making sound");
    }
}

class Dog extends Animal{

  static  void sound(){
        System.out.println("Dog is barking");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Animal a = new Dog();

        a.sound();
    }
}
