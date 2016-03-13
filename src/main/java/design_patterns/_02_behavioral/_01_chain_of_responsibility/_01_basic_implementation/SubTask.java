package design_patterns._02_behavioral._01_chain_of_responsibility._01_basic_implementation;

public class SubTask implements BaseInterface {
    private String message = "";
    private Task root = null;

    public SubTask(Task root, String message) {
        this.root = root;
        this.message = message;
    }

    public String handleRequest() {
        System.out.println("message in SubTask: " + message);
        if (root == null) {
            return message;
        } else {
            return root.handleRequest();
        }
    }
}
