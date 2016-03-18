package design_patterns._02_behavioral._11_visitor._01_basic_implementation;

public class ConcreteElement implements Element {
    private Element element;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(element);
    }
}
