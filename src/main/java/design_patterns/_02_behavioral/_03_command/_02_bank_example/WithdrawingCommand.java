package design_patterns._02_behavioral._03_command._02_bank_example;

public class WithdrawingCommand implements ICommand {
    private Receiver receiver;

    public WithdrawingCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.action(CommandTypes.WITHDRAWING);
    }
}
