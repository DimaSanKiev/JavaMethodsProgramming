package design_patterns._02_behavioral._06_memento._01_base_implementation;

// class which state is saved by Memento
public class Originator {
    private String state = "Initial state";

    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.setState(state);
        return memento;
    }

    public void execute() {
        state = "New state";
    }

    @Override
    public String toString() {
        return state;
    }
}
