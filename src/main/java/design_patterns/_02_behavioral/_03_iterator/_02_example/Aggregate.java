package design_patterns._02_behavioral._03_iterator._02_example;

public interface Aggregate {
    CustomIterator createIterator();
}
