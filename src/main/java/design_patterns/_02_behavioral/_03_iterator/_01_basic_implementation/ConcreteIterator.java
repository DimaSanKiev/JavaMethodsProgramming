package design_patterns._02_behavioral._03_iterator._01_basic_implementation;

public class ConcreteIterator implements Iterator {
    private ConcreteAggregate concreteAggregate;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.concreteAggregate = aggregate;
    }

    @Override
    public void first() {
        // first element in concreteAggregate
    }

    @Override
    public boolean isDone() {
        // check whether the end is reached
        return false;
    }

    @Override
    public void next() {
        // next element in concreteAggregate
    }

    @Override
    public Object currentItem() {
        // return current item in concreteAggregate
        return null;
    }
}
