package design_patterns._01_creational._02_abstract_factory._01_basic_implementation;

public class Runner {
    public static void main(String[] args) {
        Client client = new Client();
        client.setAbstractFactory(new ConcreteFactory());
        client.action();
    }
}
