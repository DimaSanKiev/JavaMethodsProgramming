package design_patterns._03_structural._04_composite._02_channel_example;

public abstract class ChannelLeaf implements Component {
    private int id;

    public ChannelLeaf(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public int countChannels() {
        return 1;
    }
}
