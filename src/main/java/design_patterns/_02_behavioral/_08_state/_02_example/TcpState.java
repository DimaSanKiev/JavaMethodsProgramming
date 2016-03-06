package design_patterns._02_behavioral._08_state._02_example;

public interface TcpState {
    void open(TcpConnection context);

    void close(TcpConnection context);

    void synchronize(TcpConnection context);
}
