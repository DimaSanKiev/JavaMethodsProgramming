package design_patterns._03_structural._07_proxy._01_basic_implementation;

public class BaseClass implements BaseInterface {
    @Override
    public void perform() {
        System.out.println("...performing...");
    }
}
