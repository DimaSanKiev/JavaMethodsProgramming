package design_patterns._02_behavioral._09_strategy._01_basic_implementation;

public class ConcreteStrategy implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("Using concrete algorithm.");
    }
}
