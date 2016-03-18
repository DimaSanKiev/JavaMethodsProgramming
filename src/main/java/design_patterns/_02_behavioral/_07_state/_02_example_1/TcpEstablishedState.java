package design_patterns._02_behavioral._07_state._02_example_1;

public class TcpEstablishedState implements TcpState {
    @Override
    public void open(TcpConnection context) {
        System.out.println("State Established: Opening.");
    }

    @Override
    public void close(TcpConnection context) {
        System.out.println("State Established: Closing.");
    }

    @Override
    public void synchronize(TcpConnection context) {
        System.out.println("State Established: Synchronizing.");
    }
}
