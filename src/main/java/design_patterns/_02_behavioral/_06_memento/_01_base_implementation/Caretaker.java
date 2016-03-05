package design_patterns._02_behavioral._06_memento._01_base_implementation;

// retrieves saved state
public class Caretaker {
    private Memento memento;

    public Caretaker(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }
}
