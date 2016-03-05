package design_patterns._02_behavioral._06_memento._02_example;

import java.util.HashMap;

public class RequestRunner {
    public static void main(String[] args) {
        HashMap<String, String> p = new HashMap<String, String>() {
            {
                this.put("1", "Winner");
            }
        };
        RequestParameter req = new RequestParameter(p);
        System.out.println("first " + req.getParams());

        Memento memento = req.getMemento();
        Caretaker care = new Caretaker(memento);
        req.addParam("1", "Loser");
        System.out.println("second " + req.getParams());

        memento = care.getMemento();
        req.setMemento(memento);
        System.out.println("undo to first " + req.getParams());
    }
}
