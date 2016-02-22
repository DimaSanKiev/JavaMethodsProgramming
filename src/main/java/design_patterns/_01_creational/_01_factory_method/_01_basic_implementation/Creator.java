package design_patterns._01_creational._01_factory_method._01_basic_implementation;

public abstract class Creator {
    public abstract Product factoryMethod();
    public void anOperation() {
        System.out.println("operation");
    }
}
