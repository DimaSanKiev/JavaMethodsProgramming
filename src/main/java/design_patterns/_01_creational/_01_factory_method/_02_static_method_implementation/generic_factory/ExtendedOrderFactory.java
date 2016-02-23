package design_patterns._01_creational._01_factory_method._02_static_method_implementation.generic_factory;

import design_patterns._01_creational._01_factory_method._02_static_method_implementation.ExtendedOrder;
import design_patterns._01_creational._01_factory_method._02_static_method_implementation.SimpleOrder;

public class ExtendedOrderFactory extends AbstractOrderFactory<ExtendedOrder> {

    @Override
    public ExtendedOrder createInstance() {
        return new ExtendedOrder();
    }
}
