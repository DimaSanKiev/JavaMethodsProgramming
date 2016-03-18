package design_patterns._02_behavioral._07_state._02_example_1;

public class TcpOpenState implements TcpState {
    @Override
    public void open(TcpConnection context) {
        System.out.println("State Open: Opening.");
    }

    @Override
    public void close(TcpConnection context) {
        System.out.println("State Open: Closing.");
    }

    @Override
    public void synchronize(TcpConnection context) {
        System.out.println("State Open: Synchronizing.");
    }
}
