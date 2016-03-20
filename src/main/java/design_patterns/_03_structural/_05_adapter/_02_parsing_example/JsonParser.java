package design_patterns._03_structural._05_adapter._02_parsing_example;

public class JsonParser implements Parser {
    @Override
    public Order parse(String jsonOrder) {
        Order order = new Order();
        System.out.println("Parse JSON.");
        return order;
    }
}
