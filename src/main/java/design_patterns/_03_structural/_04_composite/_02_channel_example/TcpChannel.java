package design_patterns._03_structural._04_composite._02_channel_example;

public class TcpChannel extends ChannelLeaf {
    public TcpChannel(int id) {
        super(id);
    }

    @Override
    public void send() {
        System.out.println("TCP send " + getId());
    }

    @Override
    public void receive() {
        System.out.println("TCP receive");
    }
}
