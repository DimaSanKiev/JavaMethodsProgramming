package design_patterns._01_creational._01_factory_method._02_static_method_implementation.client_class;

import design_patterns._01_creational._01_factory_method._02_static_method_implementation.AbstractOrder;

public abstract class AbstractOrderFactory {
    public abstract AbstractOrder createOrder();

    public void anOperation() {
        System.out.println("operation");
    }
}
