package design_patterns._01_creational._01_factory_method._01_basic_implementation;

public class ConcreteCreator extends Creator {
    @Override
    public Product factoryMethod() {
        // prep actions
        this.anOperation();
        return new ConcreteProduct();
    }
}
