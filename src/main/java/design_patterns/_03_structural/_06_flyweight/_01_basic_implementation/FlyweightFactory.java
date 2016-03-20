package design_patterns._03_structural._06_flyweight._01_basic_implementation;

public class FlyweightFactory {
    private Flyweight flyweight;

    public Flyweight getFlyweight() {
        return new ConcreteFlyweight();
    }
}
