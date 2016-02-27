package design_patterns._02_behavioral._03_command._01_basic_implementation;

public class CommandOne implements ICommand {
    private Receiver receiver;

    public CommandOne(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("Determine connection between receiver and action");
        receiver.action(TypeCommand.ONE);
    }
}
