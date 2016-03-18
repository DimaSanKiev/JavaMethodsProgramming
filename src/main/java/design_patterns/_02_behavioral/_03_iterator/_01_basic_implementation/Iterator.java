package design_patterns._02_behavioral._03_iterator._01_basic_implementation;

public interface Iterator {     // analog of java.util.Iterator
    void first();               // set iterator to initial position

    boolean isDone();           // analog of hasNext()

    void next();                // changes iterator's position, analog of next()

    Object currentItem();       // derives object in current position, analog of next()
}
