package design_patterns._01_creational._03_builder._01_basic_implementation;

public class Director {
    private Builder builder; // unnecessary field

    public Director(String builderMode) {
        // init builder
    }

    public Product construct(String sourceName) {
        // read data
        builder.buildPart1(1);      // int param
        builder.buildPart2("1");    // String param
        return builder.getProduct();
    }
}
