package design_patterns._01_creational._03_builder._01_basic_implementation;

public interface Builder {
    Product getProduct();

    void buildPart1(int part1);

    void buildPart2(String part2);
}
