package design_patterns._03_structural._03_facade._01_basic_implementation;

public class ClientRunner {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.generate();
    }
}
