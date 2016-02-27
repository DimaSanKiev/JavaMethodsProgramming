package design_patterns._02_behavioral._03_command._01_basic_implementation;

public class RunnerBase {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Client client = new Client(receiver);
        ICommand commandOne = client.initCommand(TypeCommand.ONE);
        Invoker invokerOne = new Invoker(commandOne);
        invokerOne.invokeCommand();
        ICommand commandTwo = client.initCommand(TypeCommand.TWO);
        Invoker invokerTwo = new Invoker(commandTwo);
        invokerTwo.invokeCommand();
    }
}
