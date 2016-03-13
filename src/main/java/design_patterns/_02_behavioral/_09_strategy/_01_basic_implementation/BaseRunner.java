package design_patterns._02_behavioral._09_strategy._01_basic_implementation;

public class BaseRunner {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategy();
        Context context = new Context(strategy);
        context.contextInterface();
    }
}
