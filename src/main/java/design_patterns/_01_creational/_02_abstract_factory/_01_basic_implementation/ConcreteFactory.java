package design_patterns._01_creational._02_abstract_factory._01_basic_implementation;

public class ConcreteFactory implements AbstractFactory {
    public AbstractProduct createProduct() {
        System.out.println("Creating concrete product");
        AbstractProduct product = new ConcreteProduct();
        return product;
    }
}
