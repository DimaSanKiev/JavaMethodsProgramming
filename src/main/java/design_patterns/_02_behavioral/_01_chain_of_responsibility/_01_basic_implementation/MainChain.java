package design_patterns._02_behavioral._01_chain_of_responsibility._01_basic_implementation;

public class MainChain {
    public static void main(String[] args) {
        // chain configuration
        Task root = new Task("Pass an exam");
        SubTask subTask = new SubTask(root, "Pass a test");
        Question question = new Question(subTask, "Pass a lab work");
        // start
        System.out.println("message from Question < " + question.handleRequest() + " >");
    }
}
