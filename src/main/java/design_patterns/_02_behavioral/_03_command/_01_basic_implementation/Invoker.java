package design_patterns._02_behavioral._03_command._01_basic_implementation;

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
