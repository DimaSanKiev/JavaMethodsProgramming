package design_patterns._01_creational._05_prototype._01_basic_implementation;

public class ConcretePrototype implements Prototype {
    // fields and polymorphic methods

    public Prototype clonePrototype() {
    // implementation of creation prototype object (clone)
        Prototype object = new ConcretePrototype(); //      to satisfy the compiler
        return object;
    }
}
