package design_patterns._01_creational._03_builder._02_example;

public class Director {
    public static User createUser(BaseBuilder builder) {
        builder.buildLogin();
        builder.buildPassword();
        return builder.getUser();
    }
}
