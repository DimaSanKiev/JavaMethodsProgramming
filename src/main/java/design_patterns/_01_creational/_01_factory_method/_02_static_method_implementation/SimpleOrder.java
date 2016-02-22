package design_patterns._01_creational._01_factory_method._02_static_method_implementation;

public class SimpleOrder extends AbstractOrder {
    // fields and methods

    @Override
    public void perform() {
        System.out.println("Simple order");
    }
}
