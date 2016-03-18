package design_patterns._02_behavioral._12_interpreter._02_regexp_example;

public class InterpreterRunner {
    public static void main(String[] args) {
        String expression = "8 2 7 4 + * -";    // expression in polska form
        Client interpreter = new Client(expression);
        System.out.println("[ " + expression + " ] = " + interpreter.calculate());
    }
}
