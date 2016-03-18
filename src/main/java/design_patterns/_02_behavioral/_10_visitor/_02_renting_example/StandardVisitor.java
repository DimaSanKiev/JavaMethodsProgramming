package design_patterns._02_behavioral._10_visitor._02_renting_example;

import design_patterns._02_behavioral._10_visitor._02_renting_example.entity.ApplianceRenting;
import design_patterns._02_behavioral._10_visitor._02_renting_example.entity.DvdRenting;

public class StandardVisitor implements Visitor {
    @Override
    public void visit(DvdRenting service) {
        System.out.println("Standard DVD renting service.");
    }

    @Override
    public void visit(ApplianceRenting service) {
        System.out.println("Standard Appliance renting service.");
    }
}
