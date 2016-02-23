package design_patterns._01_creational._01_factory_method._02_static_method_implementation.generic_factory;

import design_patterns._01_creational._01_factory_method._02_static_method_implementation.SimpleOrder;

public class SimpleOrderFactory extends AbstractOrderFactory<SimpleOrder> {

    @Override
    public SimpleOrder createInstance() {
        return new SimpleOrder();
    }
}
