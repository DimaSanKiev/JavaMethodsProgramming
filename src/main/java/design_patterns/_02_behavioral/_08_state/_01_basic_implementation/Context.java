package design_patterns._02_behavioral._08_state._01_basic_implementation;

public class Context {
    private State state;

    public Context() {
        // some code here
    }

    public void changeStateRequest() {
        state.someAction();
    }
}
