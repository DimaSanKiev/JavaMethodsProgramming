package design_patterns._02_behavioral._02_command._02_bank_example;

public class Invoker {
    private ICommand mCommand;

    public Invoker(ICommand mCommand) {
        this.mCommand = mCommand;
    }

    public void invokeCommand() {
        System.out.println("Refer to command for execution");
        mCommand.execute();
    }
}
