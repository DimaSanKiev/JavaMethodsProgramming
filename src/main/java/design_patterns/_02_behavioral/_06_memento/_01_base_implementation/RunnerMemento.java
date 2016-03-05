package design_patterns._02_behavioral._06_memento._01_base_implementation;

// save and retrieve state
public class RunnerMemento {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker(originator.createMemento());
        System.out.println(originator);
        originator.execute();
        System.out.println(originator);
        originator.setMemento(caretaker.getMemento());
        System.out.println(originator);
    }
}
