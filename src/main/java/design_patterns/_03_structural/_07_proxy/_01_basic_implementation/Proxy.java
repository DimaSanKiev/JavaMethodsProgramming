package design_patterns._03_structural._07_proxy._01_basic_implementation;

public class Proxy implements BaseInterface {
    private BaseClass base = null;

    @Override
    public void perform() {
        base = new BaseClass();
        base.perform();
    }
}
