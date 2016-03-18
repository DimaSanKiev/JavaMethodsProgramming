package design_patterns._02_behavioral._10_visitor._02_renting_example;

public interface Visitable {
    void accept(Visitor visitor);
}
