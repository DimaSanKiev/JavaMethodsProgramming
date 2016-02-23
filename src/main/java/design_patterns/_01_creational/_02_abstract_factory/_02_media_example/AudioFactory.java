package design_patterns._01_creational._02_abstract_factory._02_media_example;

public class AudioFactory extends AbstractMediaFactory {
    @Override
    public TcpMediaContent createTcpObject() {
        return new TcpAudioContent();
    }

    @Override
    public UdpMediaContent createUppObject() {
        return new UdpAudioContent();
    }
}
