package design_patterns._03_structural._07_proxy._01_basic_implementation;

public class DemoProxy {
    public static void main(String[] args) {
        BaseInterface base = new Proxy();
        base.perform();
    }
}
