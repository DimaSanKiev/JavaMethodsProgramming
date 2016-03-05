package design_patterns._02_behavioral._06_memento._02_example;

public class Caretaker {
    private Memento memento;

    public Caretaker(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }
}
