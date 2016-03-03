package design_patterns._02_behavioral._04_iterator._02_example;

public interface Aggregate {
    CustomIterator createIterator();
}
