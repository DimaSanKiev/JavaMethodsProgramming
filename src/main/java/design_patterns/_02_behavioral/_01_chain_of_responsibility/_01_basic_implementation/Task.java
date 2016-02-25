package design_patterns._02_behavioral._01_chain_of_responsibility._01_basic_implementation;

public class Task implements BaseInterface {
    private String message = "";

    public Task(String message) {
        this.message = message;
    }

    @Override
    public String handleRequest() {
        System.out.println("message in Task: " + message);
        return message;
    }
}
