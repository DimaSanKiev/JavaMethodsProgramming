package design_patterns._02_behavioral._08_state._02_univ_example_2;

public abstract class AbstractState implements IState {
    protected IState nextState;
}
