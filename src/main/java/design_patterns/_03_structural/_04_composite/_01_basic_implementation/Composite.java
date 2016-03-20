package design_patterns._03_structural._04_composite._01_basic_implementation;

import java.util.ArrayList;

// composite object
public class Composite implements Component {
    private ArrayList<Component> components = new ArrayList<Component>();

    public void operation() {
        System.out.println("Composite -> Call children operations");
        for (Component component : components) {
            component.operation();
        }
    }

    public void add(Component component) {
        System.out.println("Composite -> Adding component");
        components.add(component);
    }

    public void remove(Component component) {
        System.out.println("Composite -> Removing component");
        components.remove(component);
    }

    public Object getChild(int index) {
        System.out.println("Composite -> Getting component");
        return components.get(index);
    }
}
