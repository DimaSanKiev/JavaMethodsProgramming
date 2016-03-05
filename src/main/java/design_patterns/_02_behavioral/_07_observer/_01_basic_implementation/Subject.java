package design_patterns._02_behavioral._07_observer._01_basic_implementation;

public interface Subject {
    void attach(Observer ob);
    void detach(Observer ob);
    void notifyObservers();
}
