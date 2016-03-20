package design_patterns._03_structural._05_adapter._02_parsing_example;

public class XmlParser {
    public Order parseXml(String str, double xmlVersion, String encoding) {
        Order order = new Order();
        System.out.println("Parse xml file.");
        return order;
    }
}
