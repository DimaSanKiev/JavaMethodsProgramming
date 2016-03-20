package design_patterns._03_structural._04_composite._01_basic_implementation;

// client class (optional) that uses composite class as a field
public class Client {
    private Component component;

    public Client(Component component) {
        this.component = component;
    }

    public void execute() {
        component.operation();
    }
}
