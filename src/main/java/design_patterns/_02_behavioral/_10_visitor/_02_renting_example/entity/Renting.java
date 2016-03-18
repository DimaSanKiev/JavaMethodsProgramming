package design_patterns._02_behavioral._10_visitor._02_renting_example.entity;

import design_patterns._02_behavioral._10_visitor._02_renting_example.Visitable;

public abstract class Renting implements Visitable {
    private int term;

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
}
