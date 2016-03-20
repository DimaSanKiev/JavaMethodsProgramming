package design_patterns._03_structural._04_composite._02_channel_example;

public interface Component {
    void send();

    void receive();

    int countChannels();
}
