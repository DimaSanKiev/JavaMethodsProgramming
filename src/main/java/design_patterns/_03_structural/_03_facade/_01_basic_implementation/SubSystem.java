package design_patterns._03_structural._03_facade._01_basic_implementation;

public class SubSystem {
    public void parse() {
        System.out.println("Parsing");
    }

    public void createNode() {
        System.out.println("Creating program node");
    }
}
