package design_patterns._02_behavioral._03_command._02_bank_example;

public class CreditingCommand implements ICommand {
    private Receiver receiver;

    public CreditingCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.action(CommandTypes.CREDITING);
    }
}
