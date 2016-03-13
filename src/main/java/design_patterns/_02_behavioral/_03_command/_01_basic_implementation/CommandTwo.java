package design_patterns._02_behavioral._03_command._01_basic_implementation;

public class CommandTwo implements ICommand {
    private Receiver receiver;

    public CommandTwo(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        System.out.println("Determine connection between receiver and action");
        receiver.action(TypeCommand.TWO);
    }
}
