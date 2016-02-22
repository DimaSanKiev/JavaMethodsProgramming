package design_patterns._01_creational._01_factory_method._01_basic_implementation;

public class ConcreteProduct implements Product {
    // fields
    // constructors

    @Override
    public void check() {
        System.out.println("concrete product");
    }
}
