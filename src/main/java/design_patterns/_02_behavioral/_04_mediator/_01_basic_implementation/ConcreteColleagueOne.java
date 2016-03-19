package design_patterns._02_behavioral._04_mediator._01_basic_implementation;

public class ConcreteColleagueOne implements Colleague {
    private boolean flag;

    public void changeFlag(boolean flag) {
        this.flag = flag;
    }
}
