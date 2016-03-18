package design_patterns._02_behavioral._11_visitor._01_basic_implementation;

public interface Element {
    void accept(Visitor visitor);
}
