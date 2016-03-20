package design_patterns._03_structural._04_composite._01_basic_implementation;

// atomic element of tree-type structure
public class Leaf implements Component {
    public void operation() {
        System.out.println("Leaf -> Performing operation");
    }

    public void add(Component c) {
        System.out.println("Leaf -> add. Doing nothing");
        // exception generating and return false (if method is not void)
    }

    public void remove(Component c) {
        System.out.println("Leaf -> remove. Doing nothing");
        // exception generating and return false (if method is not void)
    }

    public Object getChild(int index) {
        throw new UnsupportedOperationException();
    }
}
