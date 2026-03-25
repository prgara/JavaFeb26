package mar24;

public abstract class Notification {

    String name;

    public Notification(String name) {
        this.name = name;
    }

    // Every notification must be sendable - I don't care how
    abstract void send();   // abstract method

    void log(){                              // concrete method
        System.out.println("Printing log");
    }
}
