package design_patterns._02_behavioral._11_visitor._02_renting_example;

import design_patterns._02_behavioral._11_visitor._02_renting_example.entity.ApplianceRenting;
import design_patterns._02_behavioral._11_visitor._02_renting_example.entity.DvdRenting;

public class PenaltyRateVisitor implements Visitor {
    @Override
    public void visit(DvdRenting service) {
        System.out.println("Penalty DVD renting service.");
    }

    @Override
    public void visit(ApplianceRenting service) {
        System.out.println("Penalty Appliance renting service.");
    }
}
