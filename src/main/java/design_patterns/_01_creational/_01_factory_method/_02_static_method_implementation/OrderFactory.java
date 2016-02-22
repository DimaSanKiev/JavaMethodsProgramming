package design_patterns._01_creational._01_factory_method._02_static_method_implementation;

// pattern simple implementation
public class OrderFactory {
    public static AbstractOrder createOrderFromFactory(String type) {
        TypeOrder sign = TypeOrder.valueOf(type.toUpperCase());
        switch (sign) {
            case SIMPLE:
                return new SimpleOrder();
            case EXTENDED:
                return new ExtendedOrder();
            default:
                throw new EnumConstantNotPresentException(TypeOrder.class, sign.name());
        }
    }

    public void anOperation() {
        System.out.println("operation");
    }
}
