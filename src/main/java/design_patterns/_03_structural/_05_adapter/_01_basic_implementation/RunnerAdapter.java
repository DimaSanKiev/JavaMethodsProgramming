package design_patterns._03_structural._05_adapter._01_basic_implementation;

public class RunnerAdapter {
    public static void main(String[] args) {
        Adapter target = new ConcreteAdapter(new Adaptee());
        Client client = new Client(target);
        client.execute();
    }
}
