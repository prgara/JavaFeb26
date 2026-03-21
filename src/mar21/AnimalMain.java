package mar21;

public class AnimalMain {
    public static void main(String[] args) {
        Animal cat = new Cat(); // ref is of parent class and object of child class // Upcasting
        cat.sound();

        Animal dog = new Dog();
        dog.sound();
    }
}
