package design_patterns._02_behavioral._11_visitor._02_renting_example.entity;

import design_patterns._02_behavioral._11_visitor._02_renting_example.Visitor;

public class DvdRenting extends Renting {
    private int numberDisks;

    public int getNumberDisks() {
        return numberDisks;
    }

    public void setNumberDisks(int numberDisks) {
        this.numberDisks = numberDisks;
    }

    @Override
    public void accept(Visitor visitor) {
        // some code here
        visitor.visit(this);
    }
}
