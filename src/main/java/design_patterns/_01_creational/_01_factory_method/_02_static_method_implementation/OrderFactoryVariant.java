package design_patterns._01_creational._01_factory_method._02_static_method_implementation;

// standard implementation
public class OrderFactoryVariant {
    // fields, methods

    public SimpleOrder createSimpleOrder() {
        return new SimpleOrder();
    }

    public ExtendedOrder createExtendedOrder() {
        return new ExtendedOrder();
    }

    public void anOperation() {
        System.out.println("operation");
    }
}
