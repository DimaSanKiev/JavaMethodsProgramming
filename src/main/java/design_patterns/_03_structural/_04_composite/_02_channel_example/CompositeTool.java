package design_patterns._03_structural._04_composite._02_channel_example;

import java.util.ArrayList;

public class CompositeTool implements Component {
    private int id;
    private ArrayList<Component> channels;

    public CompositeTool(int toolId) {
        this.id = toolId;
        channels = new ArrayList<>();
    }

    public void add(Component channel) {
        channels.add(channel);
    }

    public void remove(Component channel) {
        channels.remove(channel);
    }

    @Override
    public int countChannels() {
        int count = 0;
        for (Component channel : channels) {
            count += channel.countChannels();
        }
        return count;
    }

    @Override
    public void send() {
        System.out.println("\tComposite Tool #" + id + ", size tool: "
                + channels.size() + ", number channels: " + countChannels());
        channels.forEach(Component::send);
    }

    @Override
    public void receive() {
        // some code here
    }
}
