package design_patterns._03_structural._05_adapter._01_basic_implementation;

public class ConcreteAdapter implements Adapter {
    private Adaptee adaptee;

    public ConcreteAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("Return type - void.");
        adaptee.specificRequest();
    }
}
