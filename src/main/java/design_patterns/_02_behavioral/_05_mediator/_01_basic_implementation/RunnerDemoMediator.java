package design_patterns._02_behavioral._05_mediator._01_basic_implementation;

public class RunnerDemoMediator {
    public static void main(String[] args) {
        Mediator cm = new ConcreteMediator();
        cm.setTrue();
        cm.setFalse();
        cm.setDifferent();
    }
}
