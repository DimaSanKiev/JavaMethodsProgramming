package design_patterns._02_behavioral._08_strategy._01_basic_implementation;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface() {
        strategy.algorithm();
    }
}
