package design_patterns._03_structural._05_adapter._01_basic_implementation;

public class Adaptee {
    public boolean specificRequest() {
        System.out.println("Return type - boolean.");
        return true;    // stub
    }
}
