package design_patterns._01_creational._04_singleton._01_implementations;

// Singleton classic implementation
public class Singleton {
    private final static Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
