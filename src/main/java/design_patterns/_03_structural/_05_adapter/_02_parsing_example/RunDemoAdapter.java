package design_patterns._03_structural._05_adapter._02_parsing_example;

public class RunDemoAdapter {
    public static void main(String[] args) {
        String jsonOrder = "\"id\": \"1456\", \"firstName\": \"John\", \"lastName\": \"Smith\" ...";
        Parser parser = new JsonParser();
        Order order = parser.parse(jsonOrder);
        System.out.println(order);

        String xmlOrder = "<order id = \"1456\"><person firstName=\"John\" lastName=\"Smith\">EPAM</person></order>";
        parser = new XmlParserAdapter(new XmlParser(), 1.0, "UTF-8");
        order = parser.parse(xmlOrder);
        System.out.println(order);
    }
}
