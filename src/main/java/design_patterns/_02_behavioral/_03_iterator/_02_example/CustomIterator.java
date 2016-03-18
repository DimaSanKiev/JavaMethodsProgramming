package design_patterns._02_behavioral._03_iterator._02_example;

public interface CustomIterator {
    void first();

    void next();

    boolean isDone();

    Object currentItem();
}
