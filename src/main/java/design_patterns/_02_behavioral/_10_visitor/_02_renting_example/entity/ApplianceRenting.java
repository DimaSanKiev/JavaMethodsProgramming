package design_patterns._02_behavioral._10_visitor._02_renting_example.entity;

import design_patterns._02_behavioral._10_visitor._02_renting_example.Visitor;

public class ApplianceRenting extends Renting {
    private double redemptionPrice;

    public double getRedemptionPrice() {
        return redemptionPrice;
    }

    public void setRedemptionPrice(double redemptionPrice) {
        this.redemptionPrice = redemptionPrice;
    }

    @Override
    public void accept(Visitor visitor) {
        // some code here
        visitor.visit(this);
    }
}
