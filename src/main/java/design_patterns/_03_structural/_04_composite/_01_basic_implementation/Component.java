package design_patterns._03_structural._04_composite._01_basic_implementation;

// general interface of tree-type structure
public interface Component {
    void operation();

    void add(Component c);

    void remove(Component c);

    Object getChild(int index);
}
