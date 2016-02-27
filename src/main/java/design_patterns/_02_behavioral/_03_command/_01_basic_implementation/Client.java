package design_patterns._02_behavioral._03_command._01_basic_implementation;

public class Client {
    private Receiver mReceiver;

    public Client(Receiver mReceiver) {
        this.mReceiver = mReceiver;
    }

    public ICommand initCommand(TypeCommand cmd) {
        ICommand command = null;
        switch (cmd) {
            case ONE:
                System.out.println("Creating command One and set up its preferences");
                command = new CommandOne(mReceiver);
                break;
            case TWO:
                System.out.println("Creating command Two and set up its preferences");
                command = new CommandTwo(mReceiver);
                break;
        }
        return command;
    }
}
