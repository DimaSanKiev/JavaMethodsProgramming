package design_patterns._02_behavioral._08_state._02_example;

public class TcpClosedState implements TcpState {
    @Override
    public void open(TcpConnection context) {
        System.out.println("State Closed: Opening.");
    }

    @Override
    public void close(TcpConnection context) {
        System.out.println("State Closed: Closing.");
    }

    @Override
    public void synchronize(TcpConnection context) {
        System.out.println("State Closed: Synchronizing.");
    }
}
