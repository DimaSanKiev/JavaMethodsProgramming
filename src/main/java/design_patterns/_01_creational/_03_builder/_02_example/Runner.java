package design_patterns._01_creational._03_builder._02_example;

public class Runner {
    public static void main(String[] args) {
        User e1 = Director.createUser(new DomBuilder());
        User e2 = Director.createUser(new SaxBuilder());
    }
}
