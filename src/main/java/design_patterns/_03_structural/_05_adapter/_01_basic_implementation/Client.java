package design_patterns._03_structural._05_adapter._01_basic_implementation;

public class Client {
    private Adapter target;

    public Client(Adapter target) {
        this.target = target;
    }

    public void execute() {
        target.request();
    }
}
