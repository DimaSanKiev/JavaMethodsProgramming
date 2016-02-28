package design_patterns._02_behavioral._03_command._02_bank_example;

public class Client {
    private Receiver cReceiver;

    public Client(Receiver cReceiver) {
        this.cReceiver = cReceiver;
    }

    public ICommand initCommand(CommandTypes cmd) {
        ICommand command = null;
        switch (cmd) {
            case CREDITING:
                System.out.println("Creating command CREDITING and setting up its receiver");
                command = new CreditingCommand(cReceiver);
                break;
            case WITHDRAWING:
                System.out.println("Creating command WITHDRAWING and setting up its receiver");
                command = new WithdrawingCommand(cReceiver);
                break;
            case BLOCKING:
                System.out.println("Creating command BLOCKING and setting up its receiver");
                command = new BlockingCommand(cReceiver);
                break;
        }
        return command;
    }
}
