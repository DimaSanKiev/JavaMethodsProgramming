package design_patterns._02_behavioral._03_command._02_bank_example;

public class BlockingCommand implements ICommand {
    private Receiver receiver;

    public BlockingCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action(CommandTypes.BLOCKING);
    }
}
