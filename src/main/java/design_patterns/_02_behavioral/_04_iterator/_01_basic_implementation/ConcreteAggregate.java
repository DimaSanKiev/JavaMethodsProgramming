package design_patterns._02_behavioral._04_iterator._01_basic_implementation;

public class ConcreteAggregate implements Aggregate {
    @Override
    public Iterator createIterator() {
        System.out.println("Creating concrete iterator for concrete aggregate.");
        Iterator iterator = new ConcreteIterator(this);
        return iterator;
    }
}
