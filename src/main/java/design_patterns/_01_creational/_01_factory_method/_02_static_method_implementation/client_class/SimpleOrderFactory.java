package design_patterns._01_creational._01_factory_method._02_static_method_implementation.client_class;

import design_patterns._01_creational._01_factory_method._02_static_method_implementation.SimpleOrder;

public class SimpleOrderFactory extends AbstractOrderFactory {
    @Override
    public SimpleOrder createOrder() {
        return new SimpleOrder();
    }
}
