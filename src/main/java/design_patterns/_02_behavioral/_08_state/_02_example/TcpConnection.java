package design_patterns._02_behavioral._08_state._02_example;

public class TcpConnection {
    private TcpState state;
    // another fields


    public TcpConnection() {
        state = new TcpClosedState();
    }

    public void open() {
        state.open(this);
        this.changeState(new TcpOpenState());
    }

    public void close() {
        state.close(this);
        this.changeState(new TcpClosedState());
    }

    public void synchronize() {
        state.synchronize(this);
        this.changeState(new TcpEstablishedState());
    }

    private void changeState(TcpState state) {
        // state change ability check
        this.state = state;
    }
}
