package design_patterns._02_behavioral._11_visitor._02_renting_example;

import design_patterns._02_behavioral._11_visitor._02_renting_example.entity.ApplianceRenting;
import design_patterns._02_behavioral._11_visitor._02_renting_example.entity.DvdRenting;

public interface Visitor {
    void visit(DvdRenting service);

    void visit(ApplianceRenting service);
}
