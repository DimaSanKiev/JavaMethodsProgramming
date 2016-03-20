package design_patterns._03_structural._04_composite._02_channel_example;

public class UdpChannel extends ChannelLeaf {
    public UdpChannel(int id) {
        super(id);
    }

    @Override
    public void send() {
        System.out.println("UDP send " + getId());
    }

    @Override
    public void receive() {
        System.out.println("UDP receive");
    }
}
