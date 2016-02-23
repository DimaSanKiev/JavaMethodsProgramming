package design_patterns._01_creational._02_abstract_factory._01_basic_implementation;

public class Client {
    private AbstractFactory abstractFactory;
    private AbstractProduct abstractProduct;

    public void action() {
        abstractProduct = abstractFactory.createProduct();
        abstractProduct.info();
    }

    public void setAbstractFactory(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }
}
