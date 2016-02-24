package design_patterns._01_creational._03_builder._01_basic_implementation;

public class Runner {
    public static void main(String[] args) {
        Director director = new Director("Concrete");
        Product product = director.construct("sourcePath");
    }
}
