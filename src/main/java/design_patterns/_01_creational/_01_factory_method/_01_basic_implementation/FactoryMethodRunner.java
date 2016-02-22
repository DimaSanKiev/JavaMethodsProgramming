package design_patterns._01_creational._01_factory_method._01_basic_implementation;

public class FactoryMethodRunner {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.factoryMethod();
        product.check();
    }
}
