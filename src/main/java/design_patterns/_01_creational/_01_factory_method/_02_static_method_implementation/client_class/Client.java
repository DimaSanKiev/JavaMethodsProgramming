package design_patterns._01_creational._01_factory_method._02_static_method_implementation.client_class;

import design_patterns._01_creational._01_factory_method._02_static_method_implementation.AbstractOrder;

public class Client {
    // fields, methods

    public void someOperation(AbstractOrderFactory factory) {
        AbstractOrder order = factory.createOrder();
        order.perform();
    }
}
