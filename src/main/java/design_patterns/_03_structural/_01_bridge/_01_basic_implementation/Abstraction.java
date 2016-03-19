package design_patterns._03_structural._01_bridge._01_basic_implementation;

public interface Abstraction {
    Implementor implementor = null;

    void operation();
}
