package design_patterns._03_structural._04_composite._01_basic_implementation;

public class CompositeRunner {
    public static void main(String[] args) {
        Component composite = new Composite();
        Component leaf = new Leaf();
        leaf.add(composite);    // nothing happens
        composite.add(leaf);
        Client client = new Client(composite);
        client.execute();
    }
}
