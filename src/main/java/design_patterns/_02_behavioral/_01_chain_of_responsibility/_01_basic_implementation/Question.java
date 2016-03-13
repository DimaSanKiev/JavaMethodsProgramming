package design_patterns._02_behavioral._01_chain_of_responsibility._01_basic_implementation;

public class Question implements BaseInterface {
    private String message = "";
    private SubTask parent = null;

    public Question(SubTask parent, String message) {
        this.parent = parent;
        this.message = message;
    }

    public String handleRequest() {
        System.out.println("message in Question: " + message);
        if (parent == null) {
            return message;
        } else {
            return parent.handleRequest();
        }
    }
}
