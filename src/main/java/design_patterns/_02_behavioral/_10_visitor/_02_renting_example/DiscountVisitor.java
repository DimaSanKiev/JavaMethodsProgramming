package design_patterns._02_behavioral._10_visitor._02_renting_example;

import design_patterns._02_behavioral._10_visitor._02_renting_example.entity.ApplianceRenting;
import design_patterns._02_behavioral._10_visitor._02_renting_example.entity.DvdRenting;

public class DiscountVisitor implements Visitor {
    @Override
    public void visit(DvdRenting service) {
        System.out.println("Discount DVD renting service.");
    }

    @Override
    public void visit(ApplianceRenting service) {
        System.out.println("Discount Appliance renting service.");
    }
}
