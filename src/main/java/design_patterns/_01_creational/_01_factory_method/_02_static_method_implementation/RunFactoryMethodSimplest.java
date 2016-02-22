package design_patterns._01_creational._01_factory_method._02_static_method_implementation;

public class RunFactoryMethodSimplest {
    public static void main(String[] args) {
        AbstractOrder ob1 = OrderFactory.createOrderFromFactory("simple");
        AbstractOrder ob2 = OrderFactory.createOrderFromFactory("extended");
        ob1.perform();
        ob2.perform();
    }
}
