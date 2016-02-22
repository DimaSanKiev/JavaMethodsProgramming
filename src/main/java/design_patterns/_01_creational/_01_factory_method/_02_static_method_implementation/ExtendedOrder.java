package design_patterns._01_creational._01_factory_method._02_static_method_implementation;

public class ExtendedOrder extends AbstractOrder {
    // fields and methods

    @Override
    public void perform() {
        System.out.println("Extended order");
    }
}
