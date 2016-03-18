package design_patterns._02_behavioral._03_iterator._01_basic_implementation;

public class RunnerIteratorDemo {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        Iterator iterator = aggregate.createIterator();
        iterator.first();
        while (!iterator.isDone()) {
            Object data = iterator.currentItem();
            iterator.next();
        }
    }
}
