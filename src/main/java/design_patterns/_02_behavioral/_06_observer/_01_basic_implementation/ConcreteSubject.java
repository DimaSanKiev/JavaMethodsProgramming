package design_patterns._02_behavioral._06_observer._01_basic_implementation;

import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observer;       // could be a single object
    private Object state;

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        // implementation
        this.state = state;
    }

    public void attach(Observer ob) {
        // implementation
    }

    public void detach(Observer ob) {
        // implementation
    }

    public void notifyObservers() {
        // triggering Observer's method(s)
    }
}
