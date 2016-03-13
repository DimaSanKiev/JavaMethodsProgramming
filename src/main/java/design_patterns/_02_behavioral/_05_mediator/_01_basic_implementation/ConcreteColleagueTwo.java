package design_patterns._02_behavioral._05_mediator._01_basic_implementation;

public class ConcreteColleagueTwo implements Colleague {
    private boolean flag;

    public void changeFlag(boolean flag) {
        this.flag = flag;
    }
}
