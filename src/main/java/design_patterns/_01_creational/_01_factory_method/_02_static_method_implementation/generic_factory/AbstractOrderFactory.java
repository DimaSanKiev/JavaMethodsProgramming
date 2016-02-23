package design_patterns._01_creational._01_factory_method._02_static_method_implementation.generic_factory;

import design_patterns._01_creational._01_factory_method._02_static_method_implementation.AbstractOrder;

public abstract class AbstractOrderFactory<T extends AbstractOrder> {
    public abstract T createInstance();

    public void anOperation() {
        System.out.println("operation");
    }
}
