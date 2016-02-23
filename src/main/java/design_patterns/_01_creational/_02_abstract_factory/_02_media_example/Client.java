package design_patterns._01_creational._02_abstract_factory._02_media_example;

public class Client {
    private UdpMediaContent contentUdp;
    private TcpMediaContent contentTcp;

    public void makeMediaFactoryWork(AbstractMediaFactory factory) {
        contentUdp = factory.createUppObject();
        contentTcp = factory.createTcpObject();
        // using these objects
    }
}
