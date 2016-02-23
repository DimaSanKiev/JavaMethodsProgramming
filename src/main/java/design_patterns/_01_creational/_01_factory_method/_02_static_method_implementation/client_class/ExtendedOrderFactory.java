package design_patterns._01_creational._01_factory_method._02_static_method_implementation.client_class;

import design_patterns._01_creational._01_factory_method._02_static_method_implementation.ExtendedOrder;

public class ExtendedOrderFactory extends AbstractOrderFactory {
    @Override
    public ExtendedOrder createOrder() {
        return new ExtendedOrder();
    }
}
