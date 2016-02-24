package design_patterns._01_creational._03_builder._02_example;

public abstract class BaseBuilder {
    protected User user = new User();

    public User getUser() {
        return user;
    }

    public abstract void buildLogin();

    public abstract void buildPassword();

//    public abstract void buildUser();       // as optional version
}
