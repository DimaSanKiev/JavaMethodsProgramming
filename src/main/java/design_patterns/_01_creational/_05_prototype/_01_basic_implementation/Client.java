package design_patterns._01_creational._05_prototype._01_basic_implementation;

public class Client {
    private Prototype mPrototype;

    public void operation() {
        Prototype instance = mPrototype.clonePrototype();
        // actions with clone
    }
}
