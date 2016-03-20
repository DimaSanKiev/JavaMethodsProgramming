package design_patterns._03_structural._04_composite._02_channel_example;

public class RunComposite {
    public static void main(String[] args) {
        TcpChannel channel1 = new TcpChannel(1);
        TcpChannel channel2 = new TcpChannel(2);
        UdpChannel channel3 = new UdpChannel(3);
        UdpChannel channel4 = new UdpChannel(4);
        UdpChannel channel9 = new UdpChannel(9);

        CompositeTool mainTool = new CompositeTool(777);
        CompositeTool childTool1 = new CompositeTool(10);
        CompositeTool childTool2 = new CompositeTool(11);

        childTool1.add(channel1);
        childTool1.add(channel2);
        childTool1.add(channel3);
        childTool2.add(channel4);

        mainTool.add(childTool1);   // add channels tool (1, 2, 3)
        mainTool.add(childTool1);   // add channels tool (4)
        mainTool.add(channel9);     // add single channel (9)
        System.out.println("Main tool send:");
        mainTool.send();
        childTool1.remove(channel2);
        mainTool.remove(childTool2);
        System.out.println("Main tool send after remove:");
        mainTool.send();
    }
}
