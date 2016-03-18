package design_patterns._02_behavioral._05_memento._01_base_implementation;

// state keeper
public class Memento {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
